package com.blityapps.blitynews.domain.usecases

import com.blityapps.blitynews.domain.abstractions.UseCase
import com.blityapps.blitynews.domain.entities.Country

interface GetCountriesUseCase : UseCase<GetCountriesUseCase.Params, List<Country>> {
    class Params
}
