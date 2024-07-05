package com.test.genericsvariance

class GreenApple(private var name: String) : Apple(name) {

    fun changeName(name: String){
        this.name = name;
    }
}