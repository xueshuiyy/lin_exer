package com.exer.thread.good.codeblock;

/**
 * Created by 杨琳 on 2019/2/13.
 */
public class SyncMain {
    /**
     * 按顺序打印 线程1：从0-5，线程2：从0-5
     * @param args
     */
    public static void main0(String[] args) {
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }

    /** 下面两个main方法相同,结果相同 */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
        Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
        thread1.start();
        thread2.start();
    }

    public static void main3(String[] args) {

        SyncThread syncThread1 = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        Thread thread1 = new Thread(syncThread1, "SyncThread1");
        Thread thread2 = new Thread(syncThread2, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}
