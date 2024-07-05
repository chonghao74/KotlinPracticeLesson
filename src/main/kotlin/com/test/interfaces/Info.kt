package com.test.interfaces

interface Info<T> {
    fun setValue(t : T)
    fun getValue(): T
    fun getType() : String
}