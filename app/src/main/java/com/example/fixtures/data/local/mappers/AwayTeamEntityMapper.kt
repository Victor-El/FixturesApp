package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.AwayTeamEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Team

object AwayTeamEntityMapper: EntityMapper<AwayTeamEntity, Team> {
    override fun fromDomainModel(domainModel: Team): AwayTeamEntity {
        return AwayTeamEntity(
            domainModel.id,
            domainModel.name
        )
    }

    override fun toDomainModel(entity: AwayTeamEntity): Team {
        return Team(
            entity.id,
            entity.name
        )
    }

}