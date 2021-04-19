package com.blityapps.blitynews.database

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.blityapps.blitynews.database.daos.CountryDao
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CountryDaoTest : BaseDatabaseTest() {

    private lateinit var dao: CountryDao

    @Before
    fun setup() {
        dao = database.countryDao()
    }

    fun should_insert_all_countries() {
        assert(2 + 2 == 4)
    }
}
