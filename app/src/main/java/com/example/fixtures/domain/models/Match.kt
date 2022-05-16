package com.example.fixtures.domain.models

data class Match(
    val awayTeam: Team,
    val competition: Competition,
    val homeTeam: Team,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val score: Score,
    val season: Season,
    val stage: String,
    val status: String,
    val utcDate: String
)
