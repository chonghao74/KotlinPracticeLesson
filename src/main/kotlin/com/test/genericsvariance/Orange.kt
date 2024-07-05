package com.test.genericsvariance

import com.test.interfaces.Fruit

class Orange (private var name : String): Fruit {

    override fun getName(): String {
        return name
    }

    override fun setName(name : String) {
        this.name = name
    }
}