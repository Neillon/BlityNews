package com.blityapps.blitynews.domain.sealed

import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsCountry
import com.blityapps.blitynews.domain.enums.NewsLanguage
import java.util.*

sealed class NewsFilter {
    data class Dates(val from: Date? = null, val to: Date? = null) : NewsFilter()
    data class Language(val language: NewsLanguage? = null) : NewsFilter()
    data class Country(val country: NewsCountry? = null) : NewsFilter()
    data class Category(val category: NewsCategory? = null) : NewsFilter()
}
