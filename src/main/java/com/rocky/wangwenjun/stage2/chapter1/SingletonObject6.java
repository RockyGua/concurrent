package com.rocky.wangwenjun.stage2.chapter1;

import java.util.stream.IntStream;

public class SingletonObject6 {

    private SingletonObject6(){}

    public static class Instance{

        private static SingletonObject6 instance = new SingletonObject6();

        public static SingletonObject6 getInstance(){
            return instance;
        }
    }

    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(i -> {
            System.out.println(SingletonObject6.Instance.getInstance());
        });
    }

}
