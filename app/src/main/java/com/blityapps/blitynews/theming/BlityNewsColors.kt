package com.blityapps.blitynews.theming

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

object BlityNewsColors {

    private const val COLOR_ERROR = 0xFFB00020

    private const val COLOR_PRIMARY_LIGHT = 0xFF3a9cff
    private const val COLOR_PRIMARY_VARIANT_LIGHT = 0xFF006ecb
    private const val COLOR_SECONDARY_LIGHT = 0xFFffe0b4
    private const val COLOR_SECONDARY_VARIANT_LIGHT = 0xFFcbae84
    private const val COLOR_SURFACE_LIGHT = 0xFFF1F1F1

    val lightColors = lightColors(
        primary = Color(COLOR_PRIMARY_LIGHT),
        primaryVariant = Color(COLOR_PRIMARY_VARIANT_LIGHT),
        secondary = Color(COLOR_SECONDARY_LIGHT),
        secondaryVariant = Color(COLOR_SECONDARY_VARIANT_LIGHT),
        background = Color.White,
        surface = Color(COLOR_SURFACE_LIGHT),
        error = Color(COLOR_ERROR),
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
        onError = Color.White
    )

    private const val COLOR_PRIMARY_DARK = 0xFF7dccff
    private const val COLOR_PRIMARY_VARIANT_DARK = 0xFF3a9cff
    private const val COLOR_SECONDARY_DARK = 0xFFffffe6
    private const val COLOR_SECONDARY_VARIANT_DARK = 0xFFffe0b4
    private const val COLOR_BACKGROUND_DARK = 0xFF343434
    private const val COLOR_SURFACE_DARK = 0xFF424242

    val darkColors = darkColors(
        primary = Color(COLOR_PRIMARY_DARK),
        primaryVariant = Color(COLOR_PRIMARY_VARIANT_DARK),
        secondary = Color(COLOR_SECONDARY_DARK),
        secondaryVariant = Color(COLOR_SECONDARY_VARIANT_DARK),
        background = Color(COLOR_BACKGROUND_DARK),
        surface = Color(COLOR_SURFACE_DARK),
        error = Color(COLOR_ERROR),
        onPrimary = Color.Black,
        onSecondary = Color.Black,
        onBackground = Color.White,
        onSurface = Color.White,
        onError = Color.White
    )
}
