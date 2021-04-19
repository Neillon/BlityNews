package com.blityapps.blitynews.database.typeconverters

import androidx.room.TypeConverter
import com.blityapps.blitynews.domain.enums.NewsCategory

class NewsCategoryToStringConverter {
    @TypeConverter
    fun fromString(value: String?): NewsCategory {
        return NewsCategory.fromString(value ?: "") ?: NewsCategory.GENERAL
    }

    @TypeConverter
    fun newsCateogoryToString(category: NewsCategory?): String {
        return category?.key ?: NewsCategory.GENERAL.key
    }
}
