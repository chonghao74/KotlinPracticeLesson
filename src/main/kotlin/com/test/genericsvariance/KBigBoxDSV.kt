package com.test.genericsvariance

class KBigBoxDSV< T, out O, in I >{
    private var _t: T? = null
    private var _o: O? = null
    private var _i: I? = null

    fun getT(): T? = _t
    fun getO(): O? = _o
    fun getI(): @UnsafeVariance I? = _i

    fun setT(t: T) { _t = t }
    fun setI(i: I) { _i = i }
    fun setO(o: @UnsafeVariance O) { _o = o }
}