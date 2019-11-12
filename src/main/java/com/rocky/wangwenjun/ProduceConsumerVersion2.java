package com.rocky.wangwenjun;

public class ProduceConsumerVersion2 {

    private int i = 1;

    private final Object LOCK = new Object();

    private volatile boolean isProduced = false;

    private void consume(){
        synchronized (LOCK){
            if (isProduced){
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
                System.out.println("P->" + i);
                isProduced = true;
                LOCK.notify();
            }
        }
    }

    private void produce(){
        synchronized (LOCK){
            if (isProduced){
                System.out.println("C->" + i);
                isProduced = false;
                LOCK.notify();
            } else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final ProduceConsumerVersion2 pc = new ProduceConsumerVersion2();

        new Thread("P"){
            @Override
            public void run() {
                while (true){
                    pc.produce();
                }
            }
        }.start();

        new Thread("C"){
            @Override
            public void run() {
                while (true){
                    pc.consume();
                }
            }
        }.start();


    }
}
