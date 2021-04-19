package com.blityapps.blitynews.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.blityapps.blitynews.database.entities.CountryEntity

@Dao
interface CountryDao {
    @Insert(
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun insertAll(vararg country: CountryEntity)

    @Query(value = "SELECT * FROM country")
    suspend fun getAllCountries(): List<CountryEntity>
}