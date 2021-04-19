package com.blityapps.blitynews.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
open class BaseDatabaseTest : TestCase() {

    protected lateinit var database: BlityNewsDatabase

    @Before
    override fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, BlityNewsDatabase::class.java).build()
    }

    @After
    override fun tearDown() {
        database.close()
    }
}
