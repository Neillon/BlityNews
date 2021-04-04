package com.blityapps.blitynews.theming

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

object BlityNewsTheme {

    @Composable
    fun Theme(
        isDark: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        val defaultColors = if (isDark) BlityNewsColors.darkColors else BlityNewsColors.lightColors
        MaterialTheme(
            colors = defaultColors,
            typography = BlityNewsTypography.default,
            shapes = BlityNewsShape.default,
            content = content
        )
    }
}
