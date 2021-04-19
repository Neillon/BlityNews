package com.blityapps.blitynews.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blityapps.blitynews.domain.enums.NewsCategory

@Entity(
    tableName = "source"
)
data class SourceEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val url: String,
    val category: NewsCategory,
    val language: String,
    @ColumnInfo(name = "country_id")
    val countryId: Int
)
