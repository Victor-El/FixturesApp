package com.example.fixtures.data.local.entities

import androidx.room.ColumnInfo

data class SeasonEntity(
    val currentMatchday: Int,
    val endDate: String,
    @ColumnInfo(name = "season_name")
    val id: Int,
    val startDate: String,
)
