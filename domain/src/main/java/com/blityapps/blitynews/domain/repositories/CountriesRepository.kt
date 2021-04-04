package com.blityapps.blitynews.domain.repositories

import com.blityapps.blitynews.domain.entities.Country

interface CountriesRepository {
    suspend fun getAll(): List<Country>
}
