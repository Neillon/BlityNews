package com.blityapps.blitynews.domain.usecases

import com.blityapps.blitynews.domain.entities.Country
import com.blityapps.blitynews.domain.repositories.CountriesRepository

class GetCountriesUseCaseImpl(
    private val repository: CountriesRepository
) : GetCountriesUseCase {
    override suspend fun execute(params: GetCountriesUseCase.Params): List<Country> {
        return repository.getAll()
    }
}