package com.test.genericsvariance

class KBigBoxUSV<T , R> {
    private var _t: T? = null
    private var _r: R? = null

    fun getT(): T? = _t
    fun getN(): R? = _r

//    fun setT(t: T) { _t = t }
    fun setT(r: R) { _r = r }
}