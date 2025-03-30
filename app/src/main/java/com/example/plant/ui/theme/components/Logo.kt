package com.example.plant.ui.theme.components

import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.plant.ui.theme.RalewayFont
import com.example.plant.ui.theme.darker
import com.example.plant.ui.theme.primary

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Text(
        text = buildAnnotatedString {
            append("Plan")
            withStyle(
                style = SpanStyle(
                    color = darker,
                    fontFamily = RalewayFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            ) {
                append("t")
            }
        },
        style = TextStyle(
            color = primary,
            fontFamily = RalewayFont,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        ),
        modifier = modifier.wrapContentWidth()
    )
}