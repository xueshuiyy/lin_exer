package com.exer.thread.sync;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class SyncMain1 {
    public static void main(String[] args) {
        Sync1 sync = new Sync1();
        Thread thread1 = new Thread(sync, "A");
    }
}
