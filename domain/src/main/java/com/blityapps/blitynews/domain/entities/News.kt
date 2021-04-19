package com.blityapps.blitynews.domain.entities

import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsCountry
import com.blityapps.blitynews.domain.enums.NewsLanguage
import java.util.*

data class News(
    val source: Source,
    val author: String?,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: Date,
    val content: String,
    val category: NewsCategory = NewsCategory.GENERAL,
    val language: NewsLanguage = NewsLanguage.EN,
    val country: NewsCountry = NewsCountry.US
)
