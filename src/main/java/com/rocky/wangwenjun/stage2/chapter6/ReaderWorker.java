package com.rocky.wangwenjun.stage2.chapter6;

public class ReaderWorker extends Thread {


    private SharedData data;

    public ReaderWorker(SharedData data){
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true){
                char[] readBuf = data.read();
                System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readBuf));
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
