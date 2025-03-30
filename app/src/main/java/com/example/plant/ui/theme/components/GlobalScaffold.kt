package com.example.plant.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GlobalScaffold(
    modifier: Modifier = Modifier,
    content: @Composable (Modifier) -> Unit
) {
    Scaffold(
        topBar = {
            CustomTopBar(
                modifier = modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            CustomBottomBar(
                modifier = modifier.fillMaxWidth()
            )
        }
    ) { paddingValues ->
        content(Modifier.padding(paddingValues))
    }
}