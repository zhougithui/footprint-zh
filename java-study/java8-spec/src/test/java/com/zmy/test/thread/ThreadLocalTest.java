package com.zmy.test.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * threadlocal使用注意
 *      如果是线程池中线程，由于线程没有真正的销毁，每一次使用完成时都需要清理threadlocal中变量，
 *      否则会出现threadlocal失效的假象
 */
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
