package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.CompetitionEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Competition

object CompetitionEntityMapper: EntityMapper<CompetitionEntity, Competition> {
    override fun fromDomainModel(domainModel: Competition): CompetitionEntity {
        return CompetitionEntity(
            AreaEntityMapper.fromDomainModel(domainModel.area),
            domainModel.id,
            domainModel.name,
        )
    }

    override fun toDomainModel(entity: CompetitionEntity): Competition {
        return Competition(
            AreaEntityMapper.toDomainModel(entity.area),
            entity.id,
            entity.name
        )
    }
}