package com.nguyenhoangthanhan.jokeesingleservingapp.models.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nguyenhoangthanhan.jokeesingleservingapp.utils.Constant
import java.util.Date

@Entity(tableName = Constant.JOKE_TABLE_NAME)
class JokeStory (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constant.JOKE_STORY_ID) var jokeStoryId: Long = 0,
    @ColumnInfo(name = Constant.JOKE_CONTENT) var jokeContent: String,
    @ColumnInfo(name = Constant.JOKE_TIME) var jokeTime: Date,
    @ColumnInfo(name = Constant.JOKE_REVIEW) var jokeReviewed: Boolean = false
)