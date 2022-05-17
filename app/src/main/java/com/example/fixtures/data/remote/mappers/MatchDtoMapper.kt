package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.MatchDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Match

object MatchDtoMapper: DTOMapper<MatchDto, Match> {
    override fun fromDomainModel(domainModel: Match): MatchDto {
        return MatchDto(
            TeamDtoMapper.fromDomainModel(domainModel.awayTeam),
            CompetitionDtoMapper.fromDomainModel(domainModel.competition),
            TeamDtoMapper.fromDomainModel(domainModel.homeTeam),
            domainModel.id,
            domainModel.lastUpdated,
            domainModel.matchday,
            ScoreDtoMapper.fromDomainModel(domainModel.score),
            SeasonDtoMapper.fromDomainModel(domainModel.season),
            domainModel.stage,
            domainModel.status,
            domainModel.utcDate,
        )
    }

    override fun toDomainModel(dto: MatchDto): Match {
        return Match(
            TeamDtoMapper.toDomainModel(dto.awayTeam),
            CompetitionDtoMapper.toDomainModel(dto.competition),
            TeamDtoMapper.toDomainModel(dto.homeTeam),
            dto.id,
            dto.lastUpdated,
            dto.matchday,
            ScoreDtoMapper.toDomainModel(dto.score),
            SeasonDtoMapper.toDomainModel(dto.season),
            dto.stage,
            dto.status,
            dto.utcDate,
        )
    }
}