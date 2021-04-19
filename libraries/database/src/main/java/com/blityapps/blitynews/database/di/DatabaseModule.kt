package com.blityapps.blitynews.database.di

import com.blityapps.blitynews.database.BlityNewsDatabase
import org.koin.dsl.module

class DatabaseModule {
    val dependencies = module {
        single { BlityNewsDatabase.getInstance(get()) }
    }
}
