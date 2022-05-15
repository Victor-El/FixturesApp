package com.example.fixtures.data.local

import androidx.room.Insert
import androidx.room.Query
import com.example.fixtures.data.local.entities.MatchEntity
import kotlinx.coroutines.flow.Flow

interface FixturesDao {

    @Insert
    suspend fun insert(vararg match: MatchEntity)

    @Query("DELETE FROM matchentity")
    suspend fun deleteAll()

    fun getAll(): Flow<List<MatchEntity>>

}