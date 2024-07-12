package com.test.designpattern.factory


interface CakeFactory {
    fun createCake(choiceCake:String):Cake?;
}