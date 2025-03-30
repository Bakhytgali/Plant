package com.example.plant.data.model

import java.math.BigDecimal

data class PlantLibraryModel(
    val id: Long,
    val name: String,
    val growingDays: Int,
    val photoUrl: String?,
    val wateringInterval: Int,
    val waterQuantity: Int,
    val waterCondition: String?,
    val lightLevel: BigDecimal?,
    val airHumidity: BigDecimal?,
    val airTemperature: BigDecimal?,
    val notes: String?
)
