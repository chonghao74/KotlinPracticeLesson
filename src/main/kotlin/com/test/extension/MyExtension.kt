package com.test.extension

import com.test.enumdata.Sugar

fun Guava.setSugar(sugar: Sugar) {
    this.sugar = sugar
}

fun Guava.getSugar():Int {
    return this.sugar.type
}

//Companion object extensions
fun Guava.Companion.addMultiStart(input : String): String{
    return "* $input"
}
