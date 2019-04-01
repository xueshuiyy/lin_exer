package com.exer.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 杨琳 on 2019/2/13.
 */
public class RunnableTest implements Runnable {
    private synchronized  void testSyncMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + "testSyncMethod:" + i);
        }
    }

    public void run() {
        testSyncMethod();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        RunnableTest rt = new RunnableTest();
        RunnableTest rt1 = new RunnableTest();
        exec.execute(rt);
        exec.execute(rt1);
        exec.shutdown();
    }

}
