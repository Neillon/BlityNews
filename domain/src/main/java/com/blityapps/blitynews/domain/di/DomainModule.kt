package com.blityapps.blitynews.domain.di

import com.blityapps.blitynews.domain.usecases.getcountries.GetCountriesUseCase
import com.blityapps.blitynews.domain.usecases.getcountries.GetCountriesUseCaseImpl
import org.koin.dsl.module

object DomainModule {
    val dependencies = module {
        factory<GetCountriesUseCase> { GetCountriesUseCaseImpl(get()) }
    }
}
