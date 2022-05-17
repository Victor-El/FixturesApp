package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.AreaDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Area

object AreaDtoMapper: DTOMapper<AreaDto, Area> {
    override fun fromDomainModel(domainModel: Area): AreaDto {
        return AreaDto(
            domainModel.code,
            domainModel.ensignUrl,
            domainModel.name,
        )
    }

    override fun toDomainModel(dto: AreaDto): Area {
        return Area(
            dto.code,
            dto.ensignUrl,
            dto.name,
        )
    }
}