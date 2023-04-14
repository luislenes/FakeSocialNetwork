package com.luislenes.fakesocialnetwork.core.util

sealed class Resource<out T>(val data: T? = null, message: String? = null) {

    class Success<out T>(data: T?): Resource<T>(data)

    class Error<out T>(message: String? = null, data: T? = null) : Resource<T>(data, message)
}
