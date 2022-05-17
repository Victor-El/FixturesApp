package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.SeasonEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Season

object SeasonEntityMapper: EntityMapper<SeasonEntity, Season> {
    override fun fromDomainModel(domainModel: Season): SeasonEntity {
        return SeasonEntity(
            domainModel.currentMatchday,
            domainModel.endDate,
            domainModel.id,
            domainModel.startDate,
        )
    }

    override fun toDomainModel(entity: SeasonEntity): Season {
        return Season(
            entity.currentMatchday,
            entity.endDate,
            entity.id,
            entity.startDate
        )
    }
}