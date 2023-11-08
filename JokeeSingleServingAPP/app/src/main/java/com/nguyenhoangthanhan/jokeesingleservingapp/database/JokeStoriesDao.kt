package com.nguyenhoangthanhan.jokeesingleservingapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.nguyenhoangthanhan.jokeesingleservingapp.models.entities.JokeStory
import com.nguyenhoangthanhan.jokeesingleservingapp.utils.Constant
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
interface JokeStoriesDao {
    @Transaction
    @Query("SELECT * FROM ${Constant.JOKE_TABLE_NAME} where ${Constant.JOKE_REVIEW} = :reviewed")
    fun getAllJokesToday(reviewed: Boolean = false): LiveData<List<JokeStory>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertJokes(jokeStory: JokeStory)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun refreshJokes(jokes: List<JokeStory>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAllIfNotExist(jokes: List<JokeStory>)

    @Update
    suspend fun updateJoke(jokeStory: JokeStory)

    @Query("SELECT ${Constant.JOKE_TIME} FROM ${Constant.JOKE_TABLE_NAME} where ${Constant.JOKE_STORY_ID} = 1")
    suspend fun getLastDate(): Date?
}