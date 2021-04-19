package com.blityapps.blitynews.domain.usecases.filternews

import com.blityapps.blitynews.domain.abstractions.UseCase
import com.blityapps.blitynews.domain.entities.News
import com.blityapps.blitynews.domain.sealed.NewsFilter

interface FilterNewsUseCase : UseCase<FilterNewsUseCase.Params, List<News>> {
    data class Params(val filters: List<NewsFilter>)
}
