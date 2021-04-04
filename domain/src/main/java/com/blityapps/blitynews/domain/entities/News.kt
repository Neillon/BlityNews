package com.blityapps.blitynews.domain.entities

import java.util.Date

data class News(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: Date,
    val content: String,
)
