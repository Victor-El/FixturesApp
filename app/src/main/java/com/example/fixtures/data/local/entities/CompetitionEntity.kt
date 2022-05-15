package com.example.fixtures.data.local.entities

import androidx.room.Embedded

data class CompetitionEntity(
    @Embedded
    val area: AreaEntity,
    val id: Int,
    val name: String
)
