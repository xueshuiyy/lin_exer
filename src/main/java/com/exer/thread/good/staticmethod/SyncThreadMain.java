package com.exer.thread.good.staticmethod;

/**
 * Created by 杨琳 on 2019/2/13.
 */
public class SyncThreadMain {
    public static void main(String[] args) {
        SyncThread syncThread1 = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        Thread thread1 = new Thread(syncThread1, "SyncThread1");
        Thread thread2 = new Thread(syncThread2, "SyncThread2");
        thread1.start();
        thread2.start();
//        thread1.exit
    }
}
