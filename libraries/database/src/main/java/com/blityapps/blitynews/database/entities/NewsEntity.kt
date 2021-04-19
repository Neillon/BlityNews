package com.blityapps.blitynews.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsLanguage
import java.util.Date

@Entity(
    tableName = "news"
)
data class NewsEntity(
    @PrimaryKey
    val id: Int,
    val author: String?,
    val title: String,
    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean,
    val description: String,
    val url: String,
    @ColumnInfo(name = "url_to_image")
    val urlToImage: String,
    @ColumnInfo(name = "publish_at")
    val publishedAt: Date,
    val content: String,
    val category: NewsCategory,
    val language: NewsLanguage,
    @ColumnInfo(name = "source_id")
    val sourceId: Int,
    @ColumnInfo(name = "country_id")
    val countryId: Int
)
