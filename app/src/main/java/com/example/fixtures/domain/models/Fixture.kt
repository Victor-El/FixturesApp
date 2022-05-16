package com.example.fixtures.domain.models

import com.example.fixtures.data.remote.dtos.MatchDto

data class Fixture(
    val count: Int,
    val matches: List<MatchDto>,
)
