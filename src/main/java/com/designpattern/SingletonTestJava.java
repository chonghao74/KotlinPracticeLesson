package com.designpattern;

public class SingletonTestJava {
    private static SingletonTestJava uniqueObject = null;
    public SingletonTestJava(){
        System.out.println("init");
    }
    private int countData = 0;

    public static SingletonTestJava getInstance(){
        if(uniqueObject == null){
            uniqueObject = new SingletonTestJava();
        }

        return uniqueObject;
    }

    public int showAddCount(){
        countData++;
        return (countData);
    }

}
