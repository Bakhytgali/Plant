package com.example.plant.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.plant.R

// LOGO FONT
val RalewayFont = FontFamily(
    Font(R.font.raleway_bold, FontWeight.Bold)
)

// MAIN FONT
val NotoSansFont = FontFamily(
    Font(R.font.notosans_regular, FontWeight.Normal),
    Font(R.font.notosans_semibold, FontWeight.Bold)
)

// TIER LIST FONT
val SoloLevelingFont = FontFamily(
    Font(R.font.solo_level_demo, FontWeight.Normal)
)

// BASIC TYPOGRAPHY
val PlantTypography = Typography(
    bodyLarge = TextStyle(fontFamily = NotoSansFont, fontSize = 16.sp, color = textColor)
)
