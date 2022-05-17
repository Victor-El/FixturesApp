package com.example.fixtures.domain.usecases

import com.example.fixtures.domain.FixturesRepository
import com.example.fixtures.domain.Resource
import com.example.fixtures.domain.models.Match
import com.example.fixtures.domain.valueobjects.ViewData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetFixturesUseCase @Inject constructor(
    private val fixturesRepository: FixturesRepository,
) {
    operator fun invoke(): Flow<ViewData<List<Match>>> {
        return flow {
            val remoteData = fixturesRepository.getFixtures()

            when(remoteData) {
                is Resource.Failure -> {
                    val localData = fixturesRepository.loadCachedFixtures()
                    emit(ViewData(true, localData, remoteData.err.message))
                }
                is Resource.Loading -> {
                    emit(ViewData<List<Match>>(false, null, null))
                }
                is Resource.Success -> {
                    emit(ViewData(false, remoteData.sData, null))
                }
            }
        }
    }
}