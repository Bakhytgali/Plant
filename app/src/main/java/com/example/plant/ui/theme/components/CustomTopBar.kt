package com.example.plant.ui.theme.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.plant.ui.theme.bgColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Box (
                contentAlignment = Alignment.Center,
                modifier = modifier.fillMaxWidth()
            ) {
                Logo(modifier = modifier)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = bgColor
        )
    )
}