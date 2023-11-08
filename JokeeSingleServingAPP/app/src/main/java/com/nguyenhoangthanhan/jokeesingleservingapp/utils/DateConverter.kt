package com.nguyenhoangthanhan.jokeesingleservingapp.utils

import androidx.room.TypeConverter
import java.util.Date

object DateConverter {
    @TypeConverter
    fun toDate(dateLong: Long?): Date? {
        return dateLong?.let { Date(it) }
    }

    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}