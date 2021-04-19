package com.blityapps.blitynews.domain.usecases.favoritenews

import com.blityapps.blitynews.domain.repositories.NewsRepository

class FavoriteNewsUseCaseImpl(
    private val repository: NewsRepository
) : FavoriteNewsUseCase {
    override suspend fun execute(params: FavoriteNewsUseCase.Params) =
        repository.favoriteNews(params.newsId)
}