package com.example.plant.ui.theme.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plant.ui.theme.NotoSansFont
import com.example.plant.ui.theme.bgColor
import com.example.plant.ui.theme.containerColor
import com.example.plant.ui.theme.primary
import com.example.plant.ui.theme.secondaryDarkOnLight

@Composable
fun BatchFilter(
    filter: String,
    isActive: Boolean,
    onClick: () -> Unit
) {
    TextButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if(isActive) primary else Color.Transparent
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = filter,
            fontFamily = NotoSansFont,
            fontSize = 14.sp,
            color = if(isActive) bgColor else secondaryDarkOnLight,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 5.dp)
        )
    }
}