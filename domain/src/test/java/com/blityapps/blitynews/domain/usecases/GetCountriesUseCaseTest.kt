package com.blityapps.blitynews.domain.usecases

import com.blityapps.blitynews.domain.BaseUseCaseTest
import com.blityapps.blitynews.domain.constants.CountriesTestConstants
import com.blityapps.blitynews.domain.repositories.CountriesRepository
import com.blityapps.blitynews.domain.usecases.getcountries.GetCountriesUseCase
import com.blityapps.blitynews.domain.usecases.getcountries.GetCountriesUseCaseImpl
import io.mockk.coEvery
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

@ExperimentalCoroutinesApi
class GetCountriesUseCaseTest : BaseUseCaseTest() {

    @MockK
    lateinit var countriesRepository: CountriesRepository

    @InjectMockKs
    private lateinit var interactor: GetCountriesUseCaseImpl

    @Before
    fun setUp() {
        coEvery { countriesRepository.getAll() } returns CountriesTestConstants.someCountries
    }

    @Test
    fun `should return countries with success`() = runBlockingTest {
        val result = interactor.execute(GetCountriesUseCase.Params())
        assertEquals(CountriesTestConstants.someCountries, result)
    }

    @Test
    fun `should return countries with error`() = runBlockingTest {
        coEvery { countriesRepository.getAll() } throws Exception()
        assertFails { interactor.execute(GetCountriesUseCase.Params()) }
    }
}
