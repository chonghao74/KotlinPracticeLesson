package com.test.genericsvariance

class KBigBoxUSV2 <A> (private var apple: A?){

    fun getA(): A? = apple
    fun setA(a : A) {
        this.apple = a
    }
    fun setAA(ga: GreenApple) {
        ga.changeName("*** ${ga.getName()} ${(apple as Apple).getName()} ***")
        val aa =0
    }
}