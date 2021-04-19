package com.blityapps.blitynews.domain.constants

import com.blityapps.blitynews.domain.entities.Category
import com.blityapps.blitynews.domain.entities.Source
import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsLanguage

internal object SourceTestConstants {

    val globo = Source(
        id = "globo",
        name = "Globo",
        description = "Só na globo.com você encontra tudo sobre o conteúdo e marcas do Grupo Globo. O melhor acervo de vídeos online sobre entretenimento, esportes e jornalismo do Brasil.",
        url = "http://www.globo.com/",
        category = Category(NewsCategory.GENERAL.name),
        language = NewsLanguage.PT.langCode,
        country = CountriesTestConstants.brazil
    )

    val bbc = Source(
        id = "bbc-news",
        name = "BBC News",
        description = "Use BBC News for up-to-the-minute news, breaking news, video, audio and feature stories. BBC News provides trusted World and UK news as well as local and regional perspectives. Also entertainment, business, science, technology and health news.",
        url = "http://www.bbc.co.uk/news",
        category = Category(NewsCategory.GENERAL.name),
        language = NewsLanguage.EN.langCode,
        country = CountriesTestConstants.uk
    )
}
