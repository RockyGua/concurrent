package com.rocky.wangwenjun.stage2.chapter1;

public class SingletonObject5 {

    //volatile 并不能保证原子性，但是可以保证内存的可见性（多个线程看到的东西是同一份），还会保证有序性，是严格遵循Happens-before的，不允许JVM进行随意的优化
    //此处加volatile是避免空指针异常，因为volatile能保证在返回instance的读操作之前已经完成了所有的写操作，
    //加入构造函数里面的计算很重，如果不加volatile可能在返回instance的时候，构造函数内部还没有加载完
    private static volatile SingletonObject5 instance;

    private SingletonObject5(){

    }

    // double check
    public SingletonObject5 getInstance(){
        if (null == instance){
            synchronized (SingletonObject5.class){
                if (null == instance){
                    instance = new SingletonObject5();
                }
            }
        }
        return instance;
    }
}
