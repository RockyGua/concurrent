package com.rocky.wangwenjun.stage2.chapter8;

public class AsyncFuture<T> implements Future<T> {

    private volatile boolean done = false;

    private T result;

    public void done(T result){

        synchronized (this){
            this.result = result;
            this.done = true;
            this.notifyAll();
        }
    }

    @Override
    public T get() throws InterruptedException {
        synchronized (this){
            while (!done){
                this.wait();
            }
        }
        return result;
    }
}
