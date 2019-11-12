package com.rocky.wangwenjun.stage2.chapter8;

public interface Future<T> {

    T get() throws InterruptedException;
}
