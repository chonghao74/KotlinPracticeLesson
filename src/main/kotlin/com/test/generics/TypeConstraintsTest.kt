package com.test.generics

import com.test.interfaces.Info

class TypeConstraintsTest<T : Number, R : Number>(private var data : T)
{

    private lateinit var data2: Number
    private lateinit var data3: Any

    fun <R : Number, V:Number> setData2_1(data2 : R){
        this.data2 = data2;
    }

    fun <R,V> setData2_22(data2 : R, data3 : V) where R : Number , V : Number{
        this.data2 = data2;
    }

    fun <R> setData2_23(data3 : R) where R : CharSequence, R : Appendable{
        this.data3 = data3;
    }
}