package com.rocky.wangwenjun;

public class DemoP15 {

    public static void main(String[] args) {
        Thread t = new Thread(){

            @Override
            public void run() {
                while (true){
//                    System.out.println(">>" + this.isInterrupted());
                }
            }
        };
        t.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(t.isInterrupted());

//        t.interrupt();
        System.out.println(t.isInterrupted());
    }
}
