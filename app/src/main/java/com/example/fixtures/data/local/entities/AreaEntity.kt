package com.example.fixtures.data.local.entities

import androidx.room.ColumnInfo
import com.example.fixtures.domain.models.Area

data class AreaEntity(
    val code: String,
    val ensignUrl: String?,
    @ColumnInfo(name = "area_name")
    val name: String
)
