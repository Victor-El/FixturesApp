package com.example.fixtures.domain.mappers

interface EntityMapper<Entity, DomainModel> {

    fun fromDomainModel(domainModel: DomainModel): Entity
    fun toDomainModel(entity: Entity): DomainModel

}