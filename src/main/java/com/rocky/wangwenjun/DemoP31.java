package com.rocky.wangwenjun;

public class DemoP31 {

    public static void main(String[] args){

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("app is shutting down");
                notifyAndRelease();
            }
        });

        int i = 0;
        while (true){
            i++;
            if (i>20){
                try {

                }catch (Exception e){
                    throw new RuntimeException();
                }

            }
        }


    }

    private static void notifyAndRelease(){
        System.out.println("notify and release");
    }
}
