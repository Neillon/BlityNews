package com.blityapps.blitynews.domain.usecases.getcountries

import com.blityapps.blitynews.domain.abstractions.UseCase
import com.blityapps.blitynews.domain.entities.Country

interface GetCountriesUseCase : UseCase<GetCountriesUseCase.Params, List<Country>> {
    class Params
}
