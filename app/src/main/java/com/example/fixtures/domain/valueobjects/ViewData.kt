package com.example.fixtures.domain.valueobjects

data class ViewData<T>(
    val offline: Boolean,
    val data: T?,
    val errMsg: String?,
)
