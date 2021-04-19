package com.blityapps.blitynews.database.valueobjects

import androidx.room.Embedded
import androidx.room.Relation
import com.blityapps.blitynews.database.entities.CountryEntity
import com.blityapps.blitynews.database.entities.SourceEntity

data class SourceAndCountry(
    @Embedded
    val source: SourceEntity,
    @Relation(
        parentColumn = "country_id",
        entityColumn = "id"
    )
    val country: CountryEntity
)
