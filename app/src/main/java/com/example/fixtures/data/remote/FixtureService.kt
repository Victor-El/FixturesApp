package com.example.fixtures.data.remote

import com.example.fixtures.data.remote.dtos.Fixture
import retrofit2.http.GET

interface FixtureService {

    @GET
    suspend fun getFixtures(): Fixture

}