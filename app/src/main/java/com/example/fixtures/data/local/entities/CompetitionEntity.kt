package com.example.fixtures.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded

data class CompetitionEntity(
    @Embedded
    val area: AreaEntity,
    @ColumnInfo(name = "competition_id")
    val id: Int,
    @ColumnInfo(name = "competition_name")
    val name: String
)
