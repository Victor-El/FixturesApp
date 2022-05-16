package com.example.fixtures.domain

interface EntityMapper<Entity, DomainModel> {

    fun fromDomainModel(domainModel: DomainModel): Entity
    fun toDomainModel(entity: Entity): DomainModel

}