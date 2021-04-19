package com.blityapps.blitynews.domain.usecases

import com.blityapps.blitynews.domain.BaseUseCaseTest
import com.blityapps.blitynews.domain.constants.DateConstants
import com.blityapps.blitynews.domain.constants.NewsTestConstants
import com.blityapps.blitynews.domain.enums.NewsCategory
import com.blityapps.blitynews.domain.enums.NewsCountry
import com.blityapps.blitynews.domain.enums.NewsLanguage
import com.blityapps.blitynews.domain.repositories.NewsRepository
import com.blityapps.blitynews.domain.sealed.NewsFilter
import com.blityapps.blitynews.domain.usecases.filternews.FilterNewsUseCase
import com.blityapps.blitynews.domain.usecases.filternews.FilterNewsUseCaseImpl
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.runners.Parameterized
import org.junit.runners.Suite
import kotlin.test.assertEquals

@ExperimentalStdlibApi
@ExperimentalCoroutinesApi
@Suite.SuiteClasses(
    FilterNewsUseCaseTest.WithoutParams::class,
    FilterNewsUseCaseTest.WithParams::class
)
@RunWith(Suite::class)
abstract class FilterNewsUseCaseTest {

    abstract class BaseFilterNewsUseCaseTest : BaseUseCaseTest() {
        @MockK
        internal lateinit var newsRemoteRepository: NewsRepository

        @InjectMockKs
        internal lateinit var interactor: FilterNewsUseCaseImpl

        @Before
        fun setUp() {
            coEvery {
                newsRemoteRepository.filter(any(), any(), any(), any(), any())
            } returns NewsTestConstants.allNews
        }
    }

    @RunWith(JUnit4::class)
    class WithoutParams : BaseFilterNewsUseCaseTest() {
        @Test
        fun `should not filter any news given that there is no filter`() = runBlockingTest {
            val result = interactor.execute(
                FilterNewsUseCase.Params(
                    filters = emptyList()
                )
            )

            assertEquals(NewsTestConstants.allNews.size, result.size)
        }
    }

    @RunWith(Parameterized::class)
    class WithParams(private var filter: NewsFilter) : BaseFilterNewsUseCaseTest() {
        companion object {
            @JvmStatic
            @Parameterized.Parameters(name = "{0} filter")
            fun filterData() = listOf(
                // Dates
                arrayOf(NewsFilter.Dates()),
                arrayOf(NewsFilter.Dates(from = DateConstants.DATE_2011)),
                arrayOf(NewsFilter.Dates(to = DateConstants.DATE_2012)),
                arrayOf(
                    NewsFilter.Dates(
                        from = DateConstants.DATE_2011,
                        to = DateConstants.DATE_2013
                    )
                ),
                // Language
                arrayOf(NewsFilter.Language()),
                arrayOf(NewsFilter.Language(language = NewsLanguage.PT)),
                // Country
                arrayOf(NewsFilter.Country()),
                arrayOf(NewsFilter.Country(country = NewsCountry.BR)),
                // Category
                arrayOf(NewsFilter.Category()),
                arrayOf(NewsFilter.Category(category = NewsCategory.SPORTS)),
                arrayOf(NewsFilter.Category(category = NewsCategory.BUSINESS))
            )
        }

        @Test
        fun `should filter news with `() = runBlockingTest {
            coVerify(exactly = 1) {
                interactor.execute(
                    FilterNewsUseCase.Params(
                        filters = listOf(
                            filter
                        )
                    )
                )
            }
        }
    }
}
