package com.example.plant.ui.theme.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.plant.ui.theme.bgColor
import com.example.plant.ui.theme.components.CalendarWidget
import com.example.plant.ui.theme.components.CustomSpacer
import com.example.plant.ui.theme.components.GardensUI
import com.example.plant.ui.theme.components.GlobalScaffold

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    GlobalScaffold { mod ->
        Box (
            modifier = mod
                .fillMaxSize()
                .background(bgColor),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier
                    .fillMaxWidth(.9f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top
            ) {

                CalendarWidget()

                CustomSpacer("h30")

                GardensUI()
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MainScreenState() {
    MainScreen()
}