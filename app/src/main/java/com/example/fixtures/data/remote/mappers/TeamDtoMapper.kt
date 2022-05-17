package com.example.fixtures.data.remote.mappers

import com.example.fixtures.data.remote.dtos.TeamDto
import com.example.fixtures.domain.mappers.DTOMapper
import com.example.fixtures.domain.models.Team

object TeamDtoMapper: DTOMapper<TeamDto, Team> {
    override fun fromDomainModel(domainModel: Team): TeamDto {
        return TeamDto(
            domainModel.id,
            domainModel.name,
        )
    }

    override fun toDomainModel(dto: TeamDto): Team {
        return Team(
            dto.id,
            dto.name,
        )
    }
}