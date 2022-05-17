package com.example.fixtures.domain.mappers

interface DTOMapper<DTO, DomainModel> {
    fun fromDomainModel(domainModel: DomainModel): DTO
    fun toDomainModel(dto: DTO): DomainModel
}