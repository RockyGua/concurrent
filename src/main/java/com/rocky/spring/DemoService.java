package com.rocky.spring;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Async
    public void a() {
        while (true){
            System.out.println(Thread.currentThread().getName());
            System.out.println("a");
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Async
    public void b() {
        while (true){
            System.out.println(Thread.currentThread().getName());
            System.out.println("b");
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
