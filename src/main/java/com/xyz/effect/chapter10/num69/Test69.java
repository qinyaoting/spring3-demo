package com.xyz.effect.chapter10.num69;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test69 {

    // 69并发工具优先与wait和notify

    //既然正确的使用wait和notif比较困难，就应该用更高级的并发工具来代替

    //工具分为：Executor Framework 并发集合 同步器

    private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<String,String>();

    public static String intern(String s){

        //返回与键关联的前一个值
        String previousValue = map.putIfAbsent(s,s);
        return previousValue == null? s : previousValue;
    }

    //更好的
    public static String intern2(String s){
        //先检查是否存在
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s,s);
            if (result == null)
                result = s;
        }
        return result;
    }

    // ConcurrentHashMap除了提供了卓越的并发外，速度也非常快

    //BlockingQueue 一直等待到可以成功执行为止
    //ExecutorService 实现都使用BlockingQueue

    // 同步器是一些线程能够等待另一个线程的对象，允许他们协调动作
    //CountDownLatch Semaphore

    //demo
    public static long time(Executor executor, int concurrency,
                            final  Runnable action) throws InterruptedException {
        final CountDownLatch ready = new CountDownLatch(concurrency);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch done = new CountDownLatch(concurrency);

        for(int i=0;i<concurrency;i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    ready.countDown();
                    try {
                        start.await();
                        action.run();
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        done.countDown();
                    }
                }
            });

        }
        ready.await();
        long startNanos = System.nanoTime();
        start.countDown();
        done.await();
        return System.nanoTime() - startNanos;
    }



}
