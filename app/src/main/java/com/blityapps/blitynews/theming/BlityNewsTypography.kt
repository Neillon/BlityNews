package com.blityapps.blitynews.theming

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.blityapps.blitynews.R

object BlityNewsTypography {

    private val raleway = FontFamily(
        Font(R.font.raleway_black, FontWeight.W900),
        Font(R.font.raleway_extra_bold, FontWeight.W800),
        Font(R.font.raleway_bold, FontWeight.W700),
        Font(R.font.raleway_semi_bold, FontWeight.W600),
        Font(R.font.raleway_medium, FontWeight.W500),
        Font(R.font.raleway_regular, FontWeight.W400),
        Font(R.font.raleway_light, FontWeight.W300),
        Font(R.font.raleway_extra_light, FontWeight.W200),
        Font(R.font.raleway_thin, FontWeight.W100)
    )

    private val defaultTypography = Typography()
    val default = Typography(
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
}