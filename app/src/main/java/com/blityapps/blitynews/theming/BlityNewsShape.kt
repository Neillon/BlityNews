package com.blityapps.blitynews.theming

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

object BlityNewsShape {

    val default = Shapes(
        small = CircleShape,
        medium = RoundedCornerShape(12.dp),
        large = RoundedCornerShape(12.dp)
    )
}
