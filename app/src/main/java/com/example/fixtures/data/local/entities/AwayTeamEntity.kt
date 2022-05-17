package com.example.fixtures.data.local.entities

import androidx.room.ColumnInfo

data class AwayTeamEntity(
    @ColumnInfo(name = "away_team_id")
    val id: Int,
    @ColumnInfo(name = "away_team_name")
    val name: String
)
