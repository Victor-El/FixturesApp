package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.HomeTeamEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Team

object HomeTeamEntityMapper: EntityMapper<HomeTeamEntity, Team> {
    override fun fromDomainModel(domainModel: Team): HomeTeamEntity {
        return HomeTeamEntity(
            domainModel.id,
            domainModel.name,
        )
    }

    override fun toDomainModel(entity: HomeTeamEntity): Team {
        return Team(
            entity.id,
            entity.name,
        )
    }
}