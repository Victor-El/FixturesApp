package com.example.fixtures.domain

sealed class Resource<T>(val data: T?, error: Throwable?,) {
    data class Loading<T>(val sData: T): Resource<T>(null, null)
    data class Success<T>(val sData: T): Resource<T>(sData, null)
    data class Failure<T>(val err: Throwable): Resource<T>(null, err)
}
