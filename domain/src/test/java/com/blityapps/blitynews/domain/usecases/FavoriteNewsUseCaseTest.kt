package com.blityapps.blitynews.domain.usecases

import com.blityapps.blitynews.domain.BaseUseCaseTest
import com.blityapps.blitynews.domain.repositories.NewsRepository
import com.blityapps.blitynews.domain.usecases.favoritenews.FavoriteNewsUseCase
import com.blityapps.blitynews.domain.usecases.favoritenews.FavoriteNewsUseCaseImpl
import io.mockk.Runs
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.just
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Test
import kotlin.test.assertFails

@ExperimentalCoroutinesApi
class FavoriteNewsUseCaseTest : BaseUseCaseTest() {

    @MockK
    lateinit var newsLocalRepository: NewsRepository

    @InjectMockKs
    lateinit var interactor: FavoriteNewsUseCaseImpl

    @Before
    fun setUp() {
        coEvery { newsLocalRepository.favoriteNews(any()) } just Runs
    }

    @Test
    fun `should favorite news with success`() = runBlockingTest {
        interactor.execute(FavoriteNewsUseCase.Params(1))
        coVerify { interactor.execute(FavoriteNewsUseCase.Params(1)) }
    }

    @Test
    fun `should favorite news with error`() = runBlockingTest {
        coEvery { newsLocalRepository.favoriteNews(any()) } throws Exception()
        assertFails { interactor.execute(FavoriteNewsUseCase.Params(1)) }
    }

}
