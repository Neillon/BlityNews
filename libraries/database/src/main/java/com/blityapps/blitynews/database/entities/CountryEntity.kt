package com.blityapps.blitynews.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blityapps.blitynews.domain.enums.NewsLanguage

@Entity(
    tableName = "country"
)
data class CountryEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val code: String,
    val language: NewsLanguage
)
