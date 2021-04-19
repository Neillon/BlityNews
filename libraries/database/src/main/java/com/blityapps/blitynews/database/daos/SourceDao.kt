package com.blityapps.blitynews.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.blityapps.blitynews.database.entities.SourceEntity
import com.blityapps.blitynews.database.valueobjects.SourceAndCountry

@Dao
interface SourceDao {

    @Insert(
        onConflict = OnConflictStrategy.REPLACE
    )
    suspend fun insertAll(vararg source: SourceEntity)

    @Query(value = "SELECT * FROM source")
    suspend fun getAllSources(): List<SourceAndCountry>
}