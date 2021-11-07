package com.riadsafowan.test.retrofitDummy

sealed class Response<out T> {
    data class Success<out T>(private val value: T) : Response<T>()
}
