package com.blityapps.blitynews.domain.constants

import com.blityapps.blitynews.domain.entities.Country
import com.blityapps.blitynews.domain.enums.NewsCountry

internal object CountriesTestConstants {
    val uk = Country(
        code = NewsCountry.GB.countryCode,
        name = "United Kingdom",
        region = "Europe",
        flagUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1200px-Flag_of_the_United_Kingdom.svg.png",
    )

    val brazil = Country(
        code = NewsCountry.BR.countryCode,
        name = "Brazil",
        region = "South America",
        flagUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png",
    )

    val italy = Country(
        name = "Italy",
        code = NewsCountry.IT.countryCode,
        region = "Europe",
        flagUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/1500px-Flag_of_Italy.svg.png",
    )

    val someCountries = listOf(
        brazil,
        italy,
        uk
    )
}