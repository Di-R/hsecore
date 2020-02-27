/*
 * Copyright (c) 2020 National Research University Higher School of Economics
 * All Rights Reserved.
 */

package com.hse.core.utils

import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat
import com.hse.core.BaseApplication
import com.hse.core.R

object Fonts {
    val futuraMedium: Typeface by lazy {
        ResourcesCompat.getFont(
            BaseApplication.appContext,
            R.font.futuramedium
        )!!
    }
}