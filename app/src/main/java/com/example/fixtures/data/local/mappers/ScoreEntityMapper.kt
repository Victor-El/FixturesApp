package com.example.fixtures.data.local.mappers

import com.example.fixtures.data.local.entities.ScoreEntity
import com.example.fixtures.domain.mappers.EntityMapper
import com.example.fixtures.domain.models.Score

object ScoreEntityMapper: EntityMapper<ScoreEntity, Score> {
    override fun fromDomainModel(domainModel: Score): ScoreEntity {
        return ScoreEntity(
            domainModel.duration,
            domainModel.winner,
        )
    }

    override fun toDomainModel(entity: ScoreEntity): Score {
        return Score(
            entity.duration,
            entity.winner,
        )
    }
}