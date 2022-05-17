package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.SeasonDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Season

object SeasonDtoMapper: DTOMapper<SeasonDto, Season> {
    override fun fromDomainModel(domainModel: Season): SeasonDto {
        return SeasonDto(
            domainModel.currentMatchday,
            domainModel.endDate,
            domainModel.id,
            domainModel.startDate,
        )
    }

    override fun toDomainModel(dto: SeasonDto): Season {
        return Season(
            dto.currentMatchday,
            dto.endDate,
            dto.id,
            dto.startDate,
        )
    }
}