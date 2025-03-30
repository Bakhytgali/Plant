package com.example.plant.ui.theme.components

import BatchCard
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plant.data.api.RetrofitClient
import com.example.plant.data.model.GardenModel
import com.example.plant.data.model.PlantLibraryModel
import kotlinx.coroutines.CoroutineStart
import java.math.BigDecimal
import java.time.LocalDate
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun GardensUI(
    modifier: Modifier = Modifier
) {
    val batchFilter = listOf("All", "Growing", "Ready", "Issued")
    val activeBatchFilter = remember { mutableStateOf(batchFilter[0]) }

    val batchList = remember {
        mutableStateOf(
            listOf(
                GardenModel(
                    id = 1,
                    ownerId = 101,
                    label = "My Basil Patch",
                    plant = PlantLibraryModel(
                        id = 1,
                        name = "Basil",
                        growingDays = 30,
                        photoUrl = "VGhpcyBpcyBhIHNhbXBsZSBpbWFnZSBkYXRh",
                        wateringInterval = 2,
                        waterQuantity = 500,
                        waterCondition = "Soil",
                        lightLevel = BigDecimal(5.5),
                        airHumidity = BigDecimal(60.0),
                        airTemperature = BigDecimal(22.0),
                        notes = "Basil grows best in warm, sunny environments. Regular trimming encourages growth."
                    ),
                    substrate = "Soil",
                    sowingDate = LocalDate.parse("2025-03-15"),
                    harvestDate = LocalDate.parse("2025-04-15"),
                    quantitySowed = BigDecimal(50),
                    status = "Ready",
                    healthPoints = 95,
                    careLevel = 3
                ),
                GardenModel(
                    id = 2,
                    ownerId = 102,
                    label = "Lettuce Bed",
                    plant = PlantLibraryModel(
                        id = 2,
                        name = "Lettuce",
                        growingDays = 45,
                        photoUrl = "U2FtcGxlIGltYWdlIGRhdGEgZm9yIGxldHR1Y2U=",
                        wateringInterval = 3,
                        waterQuantity = 600,
                        waterCondition = "Keep soil consistently moist",
                        lightLevel = BigDecimal(4.0),
                        airHumidity = BigDecimal(70.0),
                        airTemperature = BigDecimal(18.0),
                        notes = "Lettuce prefers cooler temperatures and needs consistent watering."
                    ),
                    substrate = "Soil",
                    sowingDate = LocalDate.parse("2025-03-10"),
                    harvestDate = LocalDate.parse("2025-04-25"),
                    quantitySowed = BigDecimal(100),
                    status = "Issued",
                    healthPoints = 85,
                    careLevel = 4
                ),
                GardenModel(
                    id = 3,
                    ownerId = 102,
                    label = "Lettuce Bed",
                    plant = PlantLibraryModel(
                        id = 3,
                        name = "Lettuce",
                        growingDays = 45,
                        photoUrl = "U2FtcGxlIGltYWdlIGRhdGEgZm9yIGxldHR1Y2U=",
                        wateringInterval = 3,
                        waterQuantity = 600,
                        waterCondition = "Keep soil consistently moist",
                        lightLevel = BigDecimal(4.0),
                        airHumidity = BigDecimal(70.0),
                        airTemperature = BigDecimal(18.0),
                        notes = "Lettuce prefers cooler temperatures and needs consistent watering."
                    ),
                    substrate = "Soil",
                    sowingDate = LocalDate.parse("2025-03-10"),
                    harvestDate = LocalDate.parse("2025-04-25"),
                    quantitySowed = BigDecimal(100),
                    status = "Issued",
                    healthPoints = 85,
                    careLevel = 4
                ),
                GardenModel(
                    id = 4,
                    ownerId = 102,
                    label = "Lettuce Bed",
                    plant = PlantLibraryModel(
                        id = 4,
                        name = "Lettuce",
                        growingDays = 45,
                        photoUrl = "U2FtcGxlIGltYWdlIGRhdGEgZm9yIGxldHR1Y2U=",
                        wateringInterval = 3,
                        waterQuantity = 600,
                        waterCondition = "Keep soil consistently moist",
                        lightLevel = BigDecimal(4.0),
                        airHumidity = BigDecimal(70.0),
                        airTemperature = BigDecimal(18.0),
                        notes = "Lettuce prefers cooler temperatures and needs consistent watering."
                    ),
                    substrate = "Soil",
                    sowingDate = LocalDate.parse("2025-03-10"),
                    harvestDate = LocalDate.parse("2025-04-25"),
                    quantitySowed = BigDecimal(100),
                    status = "Growing",
                    healthPoints = 85,
                    careLevel = 4
                )
            )
        )
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Batches",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        CustomSpacer("h20")

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            batchFilter.forEach { filter ->
                BatchFilter(
                    filter = filter,
                    isActive = activeBatchFilter.value == filter,
                    onClick = { activeBatchFilter.value = filter }
                )
            }
        }

        CustomSpacer("h20")

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .height(800.dp)
        ) {
            items(batchList.value.chunked(2)) { rowItems ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    rowItems.forEach { batch ->
                        BatchCard(
                            batch,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }

    }
}




