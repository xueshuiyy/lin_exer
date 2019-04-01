package com.exer.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 杨琳 on 2019/2/13.
 * 对类加锁，类的所有对象都是同步的
 */
public class RunnableTest1 implements Runnable {
    private void testSyncBlock() {
        synchronized (RunnableTest1.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getId()+"testSyncBlock:" + i);
            }
        }
    }
    public void run() {
        testSyncBlock();
    }
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        RunnableTest1 rt = new RunnableTest1();
        RunnableTest1 rt1 = new RunnableTest1();
        exec.execute(rt);
        exec.execute(rt1);
        exec.shutdown();
    }
}
