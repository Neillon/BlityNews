package com.blityapps.blitynews.theming

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

object BlityNewsColors {

    val lightColors = lightColors(
        primary = Color(0xFF3a9cff),
        primaryVariant = Color(0xFF006ecb),
        secondary = Color(0xFFffe0b4),
        secondaryVariant = Color(0xFFcbae84),
        background = Color.White,
        surface = Color.White,
        error = Color(0xFFB00020),
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
        onError = Color.White
    )

    val darkColors = darkColors(
        primary = Color(0xFF7dccff),
        primaryVariant = Color(0xFF3a9cff),
        secondary = Color(0xFFffffe6),
        secondaryVariant = Color(0xFFffe0b4),
        background = Color(0xFF343434),
        surface = Color(0xFF343434),
        error = Color(0xFFB00020),
        onPrimary = Color.Black,
        onSecondary = Color.Black,
        onBackground = Color.White,
        onSurface = Color.White,
        onError = Color.White
    )

}