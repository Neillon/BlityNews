package com.blityapps.blitynews.domain.repositories

import com.blityapps.blitynews.domain.entities.News
import java.util.Date

interface NewsRepository {
    suspend fun getAll(): List<News>
    suspend fun search(text: String): List<News>
    suspend fun favoriteNews(newsId: Int)
    suspend fun unfavoriteNews(newsId: Int)
    suspend fun saveNews(news: News)
    suspend fun getTrending(): List<News>
    suspend fun filter(
        from: Date? = null,
        to: Date? = null,
        language: String? = null,
        country: String? = null,
        category: String? = null
    ): List<News>
}
