package com.blityapps.blitynews.domain.usecases.filternews

import com.blityapps.blitynews.domain.entities.News
import com.blityapps.blitynews.domain.repositories.NewsRepository
import com.blityapps.blitynews.domain.sealed.NewsFilter
import java.util.Date

class FilterNewsUseCaseImpl(
    private val repository: NewsRepository
) : FilterNewsUseCase {
    override suspend fun execute(params: FilterNewsUseCase.Params): List<News> {
        var from: Date? = null
        var to: Date? = null
        var language: String? = null
        var country: String? = null
        var category: String? = null

        params.filters.forEach { filter ->
            when (filter) {
                is NewsFilter.Country -> {
                    filter.country?.let {
                        country = it.countryCode
                    }
                }
                is NewsFilter.Dates -> {
                    filter.from?.let {
                        from = it
                    }
                    filter.to?.let {
                        to = it
                    }
                }
                is NewsFilter.Language -> {
                    filter.language?.let {
                        language = it.langCode
                    }
                }
                is NewsFilter.Category -> {
                    filter.category?.let {
                        category = it.name
                    }
                }
            }
        }

        return repository.filter(from, to, language, country, category)
    }
}
