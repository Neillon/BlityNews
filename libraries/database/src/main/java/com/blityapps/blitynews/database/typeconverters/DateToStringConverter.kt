package com.blityapps.blitynews.database.typeconverters

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.Date

class DateToStringConverter {

    @TypeConverter
    fun fromString(value: String): Date? {
        return SimpleDateFormat("yyyy-MM-dd").parse(value)
    }

    @TypeConverter
    fun dateToString(value: Date): String? {
        return SimpleDateFormat("dd/MM/yyy").format(value)
    }
}
