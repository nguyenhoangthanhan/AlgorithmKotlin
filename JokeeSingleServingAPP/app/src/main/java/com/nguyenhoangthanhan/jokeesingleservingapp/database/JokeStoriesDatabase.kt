package com.nguyenhoangthanhan.jokeesingleservingapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nguyenhoangthanhan.jokeesingleservingapp.models.entities.JokeStory
import com.nguyenhoangthanhan.jokeesingleservingapp.utils.Constant
import com.nguyenhoangthanhan.jokeesingleservingapp.utils.DateConverter

@Database(entities = [JokeStory::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class JokeStoriesDatabase : RoomDatabase() {
    abstract fun jokeStoriesDao(): JokeStoriesDao

    companion object{
        @Volatile
        private var INSTANCE : JokeStoriesDatabase? = null

        fun getInstance(context: Context): JokeStoriesDatabase = INSTANCE ?: synchronized(this){
            INSTANCE ?: Room.databaseBuilder(context.applicationContext,
                JokeStoriesDatabase::class.java,
            Constant.DATABASE_NAME).build()
                .also {
                    INSTANCE = it
                }
        }
    }
}