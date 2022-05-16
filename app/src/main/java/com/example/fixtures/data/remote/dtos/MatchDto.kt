package com.example.fixtures.data.remote.dtos

data class MatchDto(
    val awayTeam: TeamDto,
    val competition: CompetitionDto,
    val homeTeam: TeamDto,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val score: ScoreDto,
    val season: SeasonDto,
    val stage: String,
    val status: String,
    val utcDate: String
)