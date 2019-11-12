package com.rocky.wangwenjun.stage2.chapter8;

public class FutureClient {

    public static void main(String[] args) throws InterruptedException{
        FutureService futureService = new FutureService();
        Future future = futureService.submit(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "FINISH";
        }, System.out::println);
        System.out.println("============");
        Thread.sleep(1000);
        System.out.println("============");

//        System.out.println(future.get());
    }
}
