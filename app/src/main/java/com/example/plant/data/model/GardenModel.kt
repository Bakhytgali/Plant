package com.example.plant.data.model

import java.math.BigDecimal
import java.time.LocalDate

data class GardenModel(
    val id: Long,
    val ownerId: Long,
    val label: String,
    val plant: PlantLibraryModel,
    val substrate: String,
    val sowingDate: LocalDate,
    val harvestDate: LocalDate?,
    val quantitySowed: BigDecimal?,
    val status: String,
    val healthPoints: Int = 100,
    val careLevel: Int = 0
)
