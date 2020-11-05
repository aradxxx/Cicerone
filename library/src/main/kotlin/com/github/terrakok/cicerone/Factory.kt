package com.github.terrakok.cicerone

fun interface Factory<T> {
    fun create(): T
}
