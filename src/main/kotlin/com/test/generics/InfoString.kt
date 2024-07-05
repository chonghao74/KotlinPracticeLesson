package com.test.generics

import com.test.interfaces.Info

class InfoString<String> (var data : String): Info<String> {

    override fun setValue(t: String) {
        data = t;
    }

    override fun getValue(): String {
        return data
    }

    override fun getType(): kotlin.String {
        return when(data){
            is String -> "String"
            else ->{
                "else"
            }
        }
    }

}