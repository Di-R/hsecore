/*
 * Copyright (c) 2020 National Research University Higher School of Economics
 * All Rights Reserved.
 */

package com.hse.core.datasource

open class PaginationResult<T>(val list: List<T>?, val obj: Any? = null)
open class PaginationKeyed<T, K>(list: List<T>?, val key: K, obj: Any? = null) :
    PaginationResult<T>(list, obj)
