package com.test.gettersettertest

import java.util.*

class Bird {
    var name:String? = null
        get()= field?.uppercase(Locale.getDefault())
        set(value) {
            if(value != null){
                field = "**${value}**"
            }
        }
}