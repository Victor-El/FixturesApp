package com.example.fixtures.di

import com.example.fixtures.data.FixturesRepositoryImpl
import com.example.fixtures.domain.FixturesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindFixturesRepository(
        fixturesRepositoryImpl: FixturesRepositoryImpl
    ): FixturesRepository

}