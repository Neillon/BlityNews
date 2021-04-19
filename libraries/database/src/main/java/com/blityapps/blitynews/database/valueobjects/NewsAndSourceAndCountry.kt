package com.blityapps.blitynews.database.valueobjects

import androidx.room.Embedded
import androidx.room.Relation
import com.blityapps.blitynews.database.entities.CountryEntity
import com.blityapps.blitynews.database.entities.NewsEntity
import com.blityapps.blitynews.database.entities.SourceEntity

data class NewsAndSourceAndCountry(
    @Embedded
    val news: NewsEntity,
    @Relation(
        parentColumn = "country_id",
        entityColumn = "id"
    )
    val country: CountryEntity,
    @Relation(
        parentColumn = "source_id",
        entityColumn = "id"
    )
    val source: SourceEntity
)
