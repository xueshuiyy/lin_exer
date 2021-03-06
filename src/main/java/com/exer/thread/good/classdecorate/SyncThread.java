package com.exer.thread.good.classdecorate;

/**
 * Created by 杨琳 on 2019/2/13.
 */
/**
 * 同步线程
 */
class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public static void method() {
        synchronized (SyncThread.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void run() {
        method();
    }
}