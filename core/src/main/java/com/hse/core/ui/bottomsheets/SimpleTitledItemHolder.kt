/*
 * Copyright (c) 2020 National Research University Higher School of Economics
 * All Rights Reserved.
 */

package com.hse.core.ui.bottomsheets

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.hse.core.R

class SimpleTitledItemHolder(parent: ViewGroup) : BaseBottomSheetHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.bottom_sheet_item_simple_titled,
        parent,
        false
    ), BottomSheetHolders.TYPE_SIMPLE_TITLED_ITEM
) {
    val title = itemView.findViewById<TextView>(R.id.title)
    val text = itemView.findViewById<TextView>(R.id.text)
}