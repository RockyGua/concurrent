package com.rocky.wangwenjun.stage2.chapter1;

public class SingletonObject2 {

    private static SingletonObject2 instance;

    private SingletonObject2(){

    }

    public SingletonObject2 getInstance(){
        if (null == instance){
            instance = new SingletonObject2();
        }
        return instance;
    }
}
