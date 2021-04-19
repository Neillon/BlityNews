package com.blityapps.blitynews.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.blityapps.blitynews.database.entities.NewsEntity
import com.blityapps.blitynews.database.valueobjects.NewsAndSourceAndCountry

@Dao
interface NewsDao {
    @Query(value = "UPDATE news set is_favorite = :isFavorite where id == :newsId")
    suspend fun favoriteNews(isFavorite: Boolean, newsId: Int): Int

    @Transaction
    @Query(value = "SELECT * FROM news")
    suspend fun getAllNews(): List<NewsAndSourceAndCountry>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNews(vararg news: NewsEntity)
}
