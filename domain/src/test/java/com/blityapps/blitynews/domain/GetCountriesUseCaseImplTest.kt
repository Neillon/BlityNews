package com.blityapps.blitynews.domain

import com.blityapps.blitynews.domain.entities.Country
import com.blityapps.blitynews.domain.repositories.CountriesRepository
import com.blityapps.blitynews.domain.usecases.GetCountriesUseCase
import com.blityapps.blitynews.domain.usecases.GetCountriesUseCaseImpl
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class GetCountriesUseCaseTest {

    @MockK
    lateinit var countriesRepository: CountriesRepository

    private lateinit var interactor: GetCountriesUseCase
    private val someCountries = listOf(
        Country(
            name = "Brasil",
            code = "br",
            region = "South America",
            flagUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png",
        ),
        Country(
            name = "Itália",
            code = "it",
            region = "Europe",
            flagUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Flag_of_Italy.svg/1500px-Flag_of_Italy.svg.png",
        ),
        Country(
            name = "Venezuela",
            code = "vz",
            region = "South America",
            flagUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7b/Flag_of_Venezuela_%28state%29.svg",
        )
    )

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        coEvery { countriesRepository.getAll() } returns someCountries
        interactor = GetCountriesUseCaseImpl(repository = countriesRepository)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `should return countries with success`() = runBlockingTest {
        val result = interactor.execute(GetCountriesUseCase.Params())
        assertEquals(someCountries, result)
    }

}
