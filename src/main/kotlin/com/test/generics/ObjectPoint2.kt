package com.test.generics

class ObjectPoint2<T> {
    fun <T>showType2(t: T): String {
        return "else"
    }

    fun showType3(t: T): String {
        return "else"
    }

    fun <T : Number>showType4(t: T): T {
        return t
    }
}