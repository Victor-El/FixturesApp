package com.example.fixtures.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MatchEntity(
    @Embedded
    val awayTeam: TeamEntity,
    @Embedded
    val competition: CompetitionEntity,
    @Embedded
    val homeTeam: TeamEntity,
    @PrimaryKey
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    @Embedded
    val score: ScoreEntity,
    @Embedded
    val season: SeasonEntity,
    val stage: String,
    val status: String,
    val utcDate: String
)
