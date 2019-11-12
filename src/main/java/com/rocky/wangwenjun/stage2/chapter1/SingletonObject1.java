package com.rocky.wangwenjun.stage2.chapter1;

public class SingletonObject1 {

    private final static SingletonObject1 instance = new SingletonObject1();

    private SingletonObject1(){

    }

    public SingletonObject1 getInstance(){
        return instance;
    }
}
