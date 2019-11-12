package com.rocky.wangwenjun.stage2.chapter8;

import java.util.function.Consumer;

public class FutureService {

    public <T> Future<T> submit(FutureTask<T> task, Consumer<T> consumer){
        AsyncFuture asyncFuture = new AsyncFuture();
        new Thread(()->{
            T result = task.call();
            asyncFuture.done(result);
            consumer.accept(result);
        }).start();
        return asyncFuture;
    }
}
