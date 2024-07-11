package com.test.designpattern

class SingletonTestMultiThread {
    private var countData = 0;

    init {
        println("init");
    }

    companion object{
        private var uniqueObject:SingletonTestMultiThread? = null

        fun getInstance():SingletonTestMultiThread{
            if(uniqueObject==null){
                synchronized(SingletonTestMultiThread::class.java){
                    uniqueObject = SingletonTestMultiThread()
                }
            }
            return uniqueObject as SingletonTestMultiThread
        }
    }

    fun showAddCount():Int{
        countData++;
        return (countData);
    }
}