package com.blityapps.blitynews.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.blityapps.blitynews.database.daos.CountryDao
import com.blityapps.blitynews.database.daos.NewsDao
import com.blityapps.blitynews.database.daos.SourceDao
import com.blityapps.blitynews.database.entities.CountryEntity
import com.blityapps.blitynews.database.entities.NewsEntity
import com.blityapps.blitynews.database.entities.SourceEntity
import com.blityapps.blitynews.database.typeconverters.DateToStringConverter
import com.blityapps.blitynews.database.typeconverters.NewsCategoryToStringConverter
import com.blityapps.blitynews.database.typeconverters.NewsLanguageToStringConverter

@Database(
    entities = [
        CountryEntity::class,
        NewsEntity::class,
        SourceEntity::class
    ],
    version = 1
)
@TypeConverters(
    NewsCategoryToStringConverter::class,
    NewsLanguageToStringConverter::class,
    DateToStringConverter::class
)
abstract class BlityNewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao
    abstract fun countryDao(): CountryDao
    abstract fun sourceDao(): SourceDao

    companion object {
        private var instance: BlityNewsDatabase? = null

        fun getInstance(context: Context): BlityNewsDatabase {
            if (instance != null)
                return instance!!

            return Room.databaseBuilder(
                context,
                BlityNewsDatabase::class.java,
                "blity-news-database"
            ).build()
        }
    }
}