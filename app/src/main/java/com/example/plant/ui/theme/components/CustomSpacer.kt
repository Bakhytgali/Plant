package com.example.plant.ui.theme.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomSpacer(spacerInfo: String) {
    val size = spacerInfo.substring(1).toIntOrNull() ?: 0

    when {
        spacerInfo.startsWith("h") -> Spacer(modifier = Modifier.height(size.dp))
        spacerInfo.startsWith("w") -> Spacer(modifier = Modifier.width(size.dp))
    }
}
