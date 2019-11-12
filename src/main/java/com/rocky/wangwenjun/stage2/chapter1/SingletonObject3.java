package com.rocky.wangwenjun.stage2.chapter1;

public class SingletonObject3 {

    private static SingletonObject3 instance;

    private SingletonObject3(){

    }

    public synchronized SingletonObject3 getInstance(){
        if (null == instance){
            instance = new SingletonObject3();
        }
        return instance;
    }
}
