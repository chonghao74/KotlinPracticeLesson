package com.test.designpattern

class SingletonTest {

    private var countData = 0;

    init {
        println("init");
    }

    companion object{
        private var uniqueObject:SingletonTest? = null

        fun getInstance():SingletonTest{
            if(uniqueObject==null){
                uniqueObject = SingletonTest()
            }
            return uniqueObject as SingletonTest
        }
    }

    fun showAddCount():Int{
        countData++;
        return (countData);
    }

}