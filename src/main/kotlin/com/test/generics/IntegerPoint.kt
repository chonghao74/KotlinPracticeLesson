package com.test.generics

class IntegerPoint {
    private var x = 0;
    private var y = 0;

    fun setX(x: Int){
        this.x = x;
    }

    fun getX() : Int{
        return x;
    }
    fun setY(y: Int){
        this.y = y;
    }

    fun getY() : Int{
        return y;
    }
}