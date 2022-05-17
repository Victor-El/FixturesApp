package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.MatchEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Match

object MatchEntityMapper: EntityMapper<MatchEntity, Match> {
    override fun fromDomainModel(domainModel: Match): MatchEntity {
        return MatchEntity(
            AwayTeamEntityMapper.fromDomainModel(domainModel.awayTeam),
            CompetitionEntityMapper.fromDomainModel(domainModel.competition),
            HomeTeamEntityMapper.fromDomainModel(domainModel.homeTeam),
            domainModel.id,
            domainModel.lastUpdated,
            domainModel.matchday,
            ScoreEntityMapper.fromDomainModel(domainModel.score),
            SeasonEntityMapper.fromDomainModel(domainModel.season),
            domainModel.stage,
            domainModel.status,
            domainModel.utcDate,
        )
    }

    override fun toDomainModel(entity: MatchEntity): Match {
        return Match(
            AwayTeamEntityMapper.toDomainModel(entity.awayTeam),
            CompetitionEntityMapper.toDomainModel(entity.competition),
            HomeTeamEntityMapper.toDomainModel(entity.homeTeam),
            entity.id,
            entity.lastUpdated,
            entity.matchday,
            ScoreEntityMapper.toDomainModel(entity.score),
            SeasonEntityMapper.toDomainModel(entity.season),
            entity.stage,
            entity.status,
            entity.utcDate,
        )
    }

}