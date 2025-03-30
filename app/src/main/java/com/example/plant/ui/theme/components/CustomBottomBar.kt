package com.example.plant.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plant.R
import com.example.plant.ui.theme.bgColor
import com.example.plant.ui.theme.primary

@Composable
fun CustomBottomBar(
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        modifier = modifier.fillMaxWidth(),
        containerColor = bgColor
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomBarItem(R.drawable.home, "Home")
            BottomBarItem(R.drawable.stats, "Stats")
            BottomBarItem(R.drawable.add, "Add")
            BottomBarItem(R.drawable.library, "Library")
            BottomBarItem(R.drawable.user, "Profile")
        }
    }
}

@Composable
fun BottomBarItem(
    iconRes: Int,
    label: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(iconRes),
            contentDescription = "$label Icon",
            modifier = Modifier.size(26.dp)
        )
        Text(
            text = label,
            color = primary,
            fontSize = 14.sp
        )
    }
}
