package com.example.plant.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plant.ui.theme.containerColor
import com.example.plant.ui.theme.primary
import com.example.plant.ui.theme.textColor

@Composable
fun CalendarWidget(modifier: Modifier = Modifier) {
    val days = listOf("27", "28", "29", "30", "31", "01", "02")
    val activeDay = "30" // Здесь можно передавать текущий день

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(containerColor, shape = RoundedCornerShape(16.dp)) // Скругление
            .padding(16.dp)
    ) {
        Text(
            text = "Calendar",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        CustomSpacer("h30")

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            items(days) { day ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = day,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = if (activeDay == day) containerColor else textColor,
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(if (activeDay == day) primary else Color.Transparent, CircleShape) // Круглый фон
                            .padding(10.dp)
                    )
                }
            }
        }
    }
}
