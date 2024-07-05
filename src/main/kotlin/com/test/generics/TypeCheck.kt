package com.test.generics

import java.awt.Button

class TypeCheck {

    inline fun <reified T> checkType( obj1: T) :Boolean{
        var isCheck = false;

        if(Button() is T){
            isCheck = true
        }

        return isCheck
    }

//     fun <T> checkType2( obj1: T) :Boolean{
//        var isCheck = false;
//
//        if(T is Button()){
//            isCheck = true
//        }
//
//        return isCheck
//    }
}