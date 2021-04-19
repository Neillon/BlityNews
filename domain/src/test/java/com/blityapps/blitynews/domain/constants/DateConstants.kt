package com.blityapps.blitynews.domain.constants

import java.util.Calendar

internal object DateConstants {
    val DATE_2011 = Calendar.getInstance().apply {
        set(Calendar.DAY_OF_MONTH, 10)
        set(Calendar.MONTH, 10)
        set(Calendar.YEAR, 2011)
    }.time

    val DATE_2012 = Calendar.getInstance().apply {
        set(Calendar.DAY_OF_MONTH, 10)
        set(Calendar.MONTH, 10)
        set(Calendar.YEAR, 2011)
    }.time

    val DATE_2013 = Calendar.getInstance().apply {
        set(Calendar.DAY_OF_MONTH, 10)
        set(Calendar.MONTH, 10)
        set(Calendar.YEAR, 10)
    }.time
}
