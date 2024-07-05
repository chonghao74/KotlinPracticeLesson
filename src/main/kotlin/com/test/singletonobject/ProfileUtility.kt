package com.test.singletonobject

open class ProfileUtility {
    fun changeStringToUpperCase(name:String?):String{
        println("Original data is $name");
        val dataArray = name?.split("");
        val uppercaseString = dataArray?.map { it.uppercase() }
        var newString="";
        uppercaseString!!.forEach {
            newString+=it;
        }
        println("Chnage data is $newString");
        return newString;
    }
}