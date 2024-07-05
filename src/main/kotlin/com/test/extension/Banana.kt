package com.test.extension

import com.test.interfaces.Fruit

class Banana (private var name: String): Fruit {
    override fun getName(): String {
       return name
    }

    override fun setName(name: String) {
        this.name = name
    }
}