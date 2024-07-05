package com.test.sealeddata

import com.test.interfaces.Base

class Counter1(val money: Int) : Base {
    override fun count() {
        println(money *2);
    }

    override fun countDouble() {
        println(money *200);
    }

}