package com.example.builldgrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val name: Int,
    val courses: Int,
    @DrawableRes val imageRes: Int
)