package com.blityapps.blitynews.domain.entities

data class Country(
    val name: String,
    val code: String, // alpha2code
    val region: String,
    val flagUrl: String
)
