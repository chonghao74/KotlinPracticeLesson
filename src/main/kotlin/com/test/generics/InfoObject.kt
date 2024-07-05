package com.test.generics

import com.test.interfaces.Info


class InfoObject<T>(private var data : T) : Info<T> {
    override fun setValue(t: T) {
        data = t
    }

    override fun getValue(): T {
        return data
    }

    override fun getType(): String {
        return when (data){
            is Int   -> "Integer"
            is Float -> "Float"
            is String -> "String"
            is Double -> "Double"
            else -> { "else" }
        }
    }
}