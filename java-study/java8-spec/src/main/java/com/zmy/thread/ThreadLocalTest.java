package com.zmy.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {
    static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal(){
        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<>();
        }
    };

    public static void main(String[] args){
        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(()->{
            threadLocal.get().put("a", "b");
        });
        pool.submit(()->{
            System.out.println(threadLocal.get().get("a"));
        });
    }
}
