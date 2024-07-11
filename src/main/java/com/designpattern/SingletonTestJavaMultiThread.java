package com.designpattern;
public class SingletonTestJavaMultiThread {
    private static SingletonTestJavaMultiThread uniqueObject = null;
    public SingletonTestJavaMultiThread(){
        System.out.println("init");
    }
    private int countData = 0;

    public static SingletonTestJavaMultiThread getInstance(){
        if(uniqueObject == null){
            synchronized (SingletonTestJavaMultiThread.class){
                uniqueObject = new SingletonTestJavaMultiThread();
            }
        }

        return uniqueObject;
    }

    public int showAddCount(){
        countData++;
        return (countData);
    }
}
