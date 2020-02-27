/*
 * Copyright (c) 2020 National Research University Higher School of Economics
 * All Rights Reserved.
 */

package com.hse.core.viewmodels

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.hse.core.datasource.PaginatedDataSource

abstract class PaginatedViewModel<T> : BaseViewModel() {
    abstract fun observe(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<ArrayList<T>>
    )

    abstract fun getDataSource(): PaginatedDataSource<T, *>?
}