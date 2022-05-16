package com.example.fixtures.data.local.entities

import androidx.room.ColumnInfo

data class HomeTeamEntity(
    @ColumnInfo(name = "home_team_id")
    val id: Int,
    @ColumnInfo(name = "home_team_name")
    val name: String
)
