package com.rocky.wangwenjun.stage2.chapter6;

public class ReadWriteLockClient {

    public static void main(String[] args) {
        SharedData sharedData = new SharedData(10);
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new WriterWorker(sharedData, "qwertywertyu").start();
        new WriterWorker(sharedData, "zxcvbn").start();

    }
}
