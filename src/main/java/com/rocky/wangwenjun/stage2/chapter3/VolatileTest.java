package com.rocky.wangwenjun.stage2.chapter3;

public class VolatileTest {

    private static volatile int NUM = 0;

    private static final int MAX = 50;

    public static void main(String[] args) {
        new Thread("T1"){
            @Override
            public void run() {
                int localVal = NUM;
                while (localVal < MAX){
                    if (localVal != NUM){
                        System.out.println("localVal" + "->" + localVal);
                        System.out.println(Thread.currentThread().getName() + "->" + NUM);
                        localVal = NUM;
                    }
                }
            }
        }.start();

        new Thread("T2"){
            @Override
            public void run() {
                int localVal = NUM;
                while (NUM < MAX){
                    System.out.println(Thread.currentThread().getName() + "->" + (++localVal));
                    NUM = localVal;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
