package com.blityapps.blitynews.database.typeconverters

import androidx.room.TypeConverter
import com.blityapps.blitynews.domain.enums.NewsLanguage

class NewsLanguageToStringConverter {
    @TypeConverter
    fun fromString(value: String?): NewsLanguage {
        return NewsLanguage.fromString(value ?: "") ?: NewsLanguage.EN
    }

    @TypeConverter
    fun newsCateogoryToString(language: NewsLanguage?): String {
        return language?.langCode ?: NewsLanguage.EN.langCode
    }
}
