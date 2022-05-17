package com.example.fixtures.data.remote

import com.example.fixtures.API_KEY
import com.example.fixtures.data.remote.dtos.FixtureDto
import retrofit2.http.GET
import retrofit2.http.Headers

interface FixtureService {

    @GET("matches")
    @Headers("X-Auth-Token: $API_KEY")
    suspend fun getFixtures(): FixtureDto

}