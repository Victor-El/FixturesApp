package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.CompetitionDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Competition

object CompetitionDtoMapper: DTOMapper<CompetitionDto, Competition> {
    override fun fromDomainModel(domainModel: Competition): CompetitionDto {
        return CompetitionDto(
            AreaDtoMapper.fromDomainModel(domainModel.area),
            domainModel.id,
            domainModel.name,
        )
    }

    override fun toDomainModel(dto: CompetitionDto): Competition {
        return Competition(
            AreaDtoMapper.toDomainModel(dto.area),
            dto.id,
            dto.name,
        )
    }
}