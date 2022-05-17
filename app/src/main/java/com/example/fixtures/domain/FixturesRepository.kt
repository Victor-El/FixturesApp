package com.example.fixtures.domain

import com.example.fixtures.domain.models.Match
import kotlinx.coroutines.flow.Flow

interface FixturesRepository {

    suspend fun getFixtures(): Resource<List<Match>>
    suspend fun loadCachedFixtures(): List<Match>

}