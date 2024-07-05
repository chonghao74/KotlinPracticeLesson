package com.test.generics

class FloatPoint {
    private var x = 0f;
    private var y = 0f;

    fun setX(x: Float){
        this.x = x;
    }

    fun getX() : Float{
        return x;
    }
    fun setY(y: Float){
        this.y = y;
    }

    fun getY() : Float{
        return y;
    }
}