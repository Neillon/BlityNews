package com.blityapps.blitynews.domain.usecases.favoritenews

import com.blityapps.blitynews.domain.abstractions.UseCase

interface FavoriteNewsUseCase: UseCase<FavoriteNewsUseCase.Params, Unit> {
    data class Params(val newsId: Int)
}