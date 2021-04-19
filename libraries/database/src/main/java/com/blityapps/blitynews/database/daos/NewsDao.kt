package com.blityapps.blitynews.database.daos

import androidx.room.*
import com.blityapps.blitynews.database.entities.NewsEntity
import com.blityapps.blitynews.database.valueobjects.NewsAndSourceAndCountry

@Dao
interface NewsDao {
    @Query(
        value = "UPDATE news set is_favorite = ${true} where id == :newsId"
    )
    suspend fun favoriteNews(newsId: Int): Int

    @Query(
        value = "UPDATE news set is_favorite = ${false} where id == :newsId"
    )
    suspend fun unfavoriteNews(newsId: Int): Int

    @Transaction
    @Query(value = "SELECT * FROM news")
    suspend fun getAllNews(): List<NewsAndSourceAndCountry>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNews(vararg news: NewsEntity)
}