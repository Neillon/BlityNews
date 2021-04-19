package com.blityapps.blitynews.domain.constants

import com.blityapps.blitynews.domain.entities.News
import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsCountry
import com.blityapps.blitynews.domain.enums.NewsLanguage
import java.util.Calendar

internal object NewsTestConstants {

    val newsFromGlobo = News(
        source = SourceTestConstants.globo,
        author = "Jose Maria",
        title = "Globo Notice",
        description = "A simple description",
        url = "",
        urlToImage = "",
        publishedAt = Calendar.getInstance().apply {
            set(Calendar.DAY_OF_MONTH, 10)
            set(Calendar.MONTH, 10)
            set(Calendar.YEAR, 2011)
        }.time,
        content = "",
        country = NewsCountry.BR,
        language = NewsLanguage.PT,
        category = NewsCategory.SPORTS
    )

    val newsFromBBC = News(
        source = SourceTestConstants.bbc,
        author = "John Doe",
        title = "BBC Notice",
        description = "A simple description from BBC",
        url = "",
        urlToImage = "",
        publishedAt = Calendar.getInstance().apply {
            set(Calendar.DAY_OF_MONTH, 10)
            set(Calendar.MONTH, 10)
            set(Calendar.YEAR, 2013)
        }.time,
        content = "",
        country = NewsCountry.GB,
        language = NewsLanguage.EN,
        category = NewsCategory.BUSINESS
    )

    @ExperimentalStdlibApi
    val allNews = buildList {
        add(newsFromGlobo)
        add(newsFromBBC)
    }

    val noNews = emptyList<News>()
}
