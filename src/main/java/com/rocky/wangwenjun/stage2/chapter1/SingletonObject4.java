package com.rocky.wangwenjun.stage2.chapter1;

public class SingletonObject4 {

    private static SingletonObject4 instance;

    private SingletonObject4(){

    }

    // double check
    public SingletonObject4 getInstance(){
        if (null == instance){
            synchronized (SingletonObject4.class){
                if (null == instance){
                    instance = new SingletonObject4();
                }
            }
        }
        return instance;
    }
}
