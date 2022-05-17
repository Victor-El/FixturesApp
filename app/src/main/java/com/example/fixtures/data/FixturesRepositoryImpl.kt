package com.example.fixtures.data

import android.util.Log
import com.example.fixtures.data.local.AppDatabase
import com.example.fixtures.data.local.mappers.MatchEntityMapper
import com.example.fixtures.data.remote.FixtureService
import com.example.fixtures.data.remote.mappers.MatchDtoMapper
import com.example.fixtures.domain.FixturesRepository
import com.example.fixtures.domain.Resource
import com.example.fixtures.domain.models.Match
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class FixturesRepositoryImpl @Inject constructor(
    private val fixtureService: FixtureService,
    private val appDatabase: AppDatabase,
): FixturesRepository {
    override suspend fun getFixtures(): Resource<List<Match>> {
        return try {
            val data = fixtureService.getFixtures()
            appDatabase.fixturesDao().insert(*data.matches.map { MatchEntityMapper.fromDomainModel(MatchDtoMapper.toDomainModel(it)) }.toTypedArray())
            Resource.Success(data.matches.map { MatchDtoMapper.toDomainModel(it) })
        } catch (e: Exception) {
            when (e) {
                is IOException -> {
                    Resource.Failure(e)
                }
                is HttpException -> {
                    Resource.Failure(e)
                }
                else -> {
                    Log.d("DATA_LOG", e.localizedMessage ?: "Unknown Error")
                    Resource.Failure(Exception(e.localizedMessage ?: "Unknown Error"))
                }
            }
        }
    }

    override suspend fun loadCachedFixtures(): List<Match> {
        return appDatabase.fixturesDao().getAll().map { matchEntity ->
            MatchEntityMapper.toDomainModel(matchEntity)
        }
    }
}