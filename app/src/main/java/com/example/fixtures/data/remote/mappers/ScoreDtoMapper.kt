package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.ScoreDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Score

object ScoreDtoMapper: DTOMapper<ScoreDto, Score> {
    override fun fromDomainModel(domainModel: Score): ScoreDto {
        return ScoreDto(
            domainModel.duration,
            domainModel.winner,
        )
    }

    override fun toDomainModel(dto: ScoreDto): Score {
        return Score(
            dto.duration,
            dto.winner,
        )
    }
}