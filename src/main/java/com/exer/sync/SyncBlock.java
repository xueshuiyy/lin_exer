package com.exer.sync;

/**
 * Created by Administrator on 2019/5/7.
 */
public class SyncBlock {
    public static void main(String[] args) {
    }

    public void test() {
        synchronized (this) {
            System.out.println("Show SyncBlock");
        }
    }
}
