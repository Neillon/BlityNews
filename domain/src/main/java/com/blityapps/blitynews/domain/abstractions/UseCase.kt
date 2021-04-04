package com.blityapps.blitynews.domain.abstractions

interface UseCase<in T, out S> {
    suspend fun execute(params: T): S
}
