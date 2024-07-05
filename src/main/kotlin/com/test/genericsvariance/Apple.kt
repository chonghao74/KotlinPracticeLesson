package com.test.genericsvariance

import com.test.interfaces.Fruit

open class Apple (private var name : String): Fruit {

    override fun getName(): String {
        return name
    }

    override fun setName(name : String) {
        this.name = name
    }
}