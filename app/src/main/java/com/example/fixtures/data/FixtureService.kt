package com.example.fixtures.data

import com.example.fixtures.data.dtos.Fixture
import retrofit2.http.GET

interface FixtureService {

    @GET
    suspend fun getFixtures(): Fixture

}