package com.blityapps.blitynews

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

object Theming {

    private val lightColors = lightColors(
        primary = Color(0xFF6200EE),
        primaryVariant = Color(0xFF3700B3),
        secondary = Color(0xFF03DAC6),
        secondaryVariant = Color(0xFF018786),
        background = Color.White,
        surface = Color.White,
        error = Color(0xFFB00020),
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
        onError = Color.White
    )

    private val darkColors = darkColors(
        primary = Color(0xFFBB86FC),
        primaryVariant = Color(0xFF3700B3),
        secondary = Color(0xFF03DAC6),
        secondaryVariant = Color(0xFF03DAC6),
        background = Color(0xFF121212),
        surface = Color(0xFF121212),
        error = Color(0xFFCF6679),
        onPrimary = Color.Black,
        onSecondary = Color.Black,
        onBackground = Color.White,
        onSurface = Color.White,
        onError = Color.Black
    )

    private val raleway = FontFamily(
        Font(R.font.raleway_black, FontWeight.W900),
        Font(R.font.raleway_extra_bold, FontWeight.W800),
        Font(R.font.raleway_bold, FontWeight.W700),
        // Font(R.font.raleway_semi_bold, FontWeight.W600),
        Font(R.font.raleway_medium, FontWeight.W500),
        Font(R.font.raleway_regular, FontWeight.W400),
        Font(R.font.raleway_light, FontWeight.W300),
        Font(R.font.raleway_extra_light, FontWeight.W200),
        Font(R.font.raleway_thin, FontWeight.W100)
    )

    private val defaultTypography = Typography()
    private val blityThemeTypography = Typography(
        defaultFontFamily = raleway,
        h1 = defaultTypography.h1.copy(fontFamily = raleway),
        h2 = defaultTypography.h2.copy(fontFamily = raleway),
        h3 = defaultTypography.h3.copy(fontFamily = raleway),
        h4 = defaultTypography.h4.copy(fontFamily = raleway),
        h5 = defaultTypography.h5.copy(fontFamily = raleway),
        h6 = defaultTypography.h6.copy(fontFamily = raleway),
        subtitle1 = defaultTypography.subtitle1.copy(fontFamily = raleway),
        subtitle2 = defaultTypography.subtitle2.copy(fontFamily = raleway),
        body1 = defaultTypography.body1.copy(fontFamily = raleway),
        body2 = defaultTypography.body2.copy(fontFamily = raleway),
        button = defaultTypography.button.copy(fontFamily = raleway),
        caption = defaultTypography.caption.copy(fontFamily = raleway),
        overline = defaultTypography.overline.copy(fontFamily = raleway)
    )

    @Composable
    fun BlityNewsTheme(
        isDark: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        MaterialTheme(
            colors = if (isDark) darkColors else lightColors,
            typography = blityThemeTypography,
            content = content
        )
    }
}