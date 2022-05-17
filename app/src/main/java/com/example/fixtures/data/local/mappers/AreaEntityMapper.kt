package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.AreaEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Area

object AreaEntityMapper: EntityMapper<AreaEntity, Area> {
    override fun fromDomainModel(domainModel: Area): AreaEntity {
        return AreaEntity(
            domainModel.code,
            domainModel.ensignUrl,
            domainModel.name
        )
    }

    override fun toDomainModel(entity: AreaEntity): Area {
        return Area(
            entity.code,
            entity.ensignUrl,
            entity.name,
        )
    }
}