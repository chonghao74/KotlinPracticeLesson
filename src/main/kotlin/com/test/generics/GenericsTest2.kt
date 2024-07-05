package com.test.generics

class GenericsTest2{

    fun <T : Number> compareObj(obj1 : T, obj2 : T) : Boolean{
        if(obj1 == obj2){
            return true
        }

        return false
    }

    companion object{
        fun <T> transStrOrInt(data : T):T{
            return data
        }
    }
}