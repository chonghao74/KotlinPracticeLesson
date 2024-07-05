package com.test.sealeddata

import com.test.interfaces.Base

class Counter2 (val counter1:Base) : Base by counter1{
    override fun countDouble() {
        println(200);
    }
}