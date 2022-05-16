package com.example.fixtures.data.remote

import com.example.fixtures.data.remote.dtos.FixtureDto
import retrofit2.http.GET

interface FixtureService {

    @GET
    suspend fun getFixtures(): FixtureDto

}