package com.example.fixtures.data.local

import androidx.room.TypeConverter
import com.example.fixtures.data.local.entities.AreaEntity

class Converters {

    @TypeConverter
    fun fromAreaEntity(areaEntity: AreaEntity): String {
        return "${areaEntity.code},${areaEntity.ensignUrl},${areaEntity.name}"
    }

    @TypeConverter
    fun toAreaEntity(string: String): AreaEntity {
        val list = string.split(",")
        return AreaEntity(list[0], list[1], list[2])
    }

}