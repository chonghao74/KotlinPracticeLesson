package com.test.extension

import com.test.enumdata.Sugar
import com.test.interfaces.Fruit

class Guava (private var name: String = "Guava", var sugar: Sugar): Fruit {
    override fun getName(): String {
        return name
    }

    override fun setName(name: String) {
        this.name = name
    }

    companion object {
        fun String.addStart():String{
            val data = this
            return "* {$data}"
        }
    }
}