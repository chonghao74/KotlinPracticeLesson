package com.test.generics

class ObjectPoint <T>(private var x:T, private var y :T){

    fun setX(x: T){
        this.x = x;
    }

    fun getX() : T{
        return x;
    }
    fun setY(y: T){
        this.y = y;
    }

    fun getY() : T{
        return y;
    }

    fun <T>showType2(t: T): String {
        return "else"
    }

    fun showType3(t: T): String {
        return "else"
    }

    //靜態方法，若參數為 Generic 則就必須於 fun 後 加 <T> 否則出錯
    companion object{
        //
        fun <T> showTypeString(t :T):String{
            return when(t){
                is Int -> "Int"
                is String -> "String"
                is Float -> "Float"
                else -> "else"
            }
        }

//        fun showTypeStringError(t :T):String{
//            return when(t){
//                is Int -> "Int"
//                is String -> "String"
//                is Float -> "Float"
//                else -> "else"
//            }
//        }
    }

}