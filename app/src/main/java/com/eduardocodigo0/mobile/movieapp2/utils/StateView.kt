package com.eduardocodigo0.mobile.movieapp2.utils

sealed class StateView<T>() {

    class Error(msg: String): StateView<Unit>()
    class Success<T>(val value: T): StateView<T>()
    class Loading: StateView<Unit>()

}