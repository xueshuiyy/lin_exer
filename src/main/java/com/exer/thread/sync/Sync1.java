package com.exer.thread.sync;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class Sync1 implements Runnable {
    Account account = new Account();
    @Override
    public void run() {
        testMethod();
    }

    public synchronized void testMethod() {
        System.out.println(Thread.currentThread().getName());
    }

    /** 对象加锁 方式一*/
    /*public void testMethod() {
        synchronized (account) {
            System.out.println(Thread.currentThread().getName());
        }
    }*/
    /** 对象加锁 方式二*/
   /* public void testMethod() {
        Byte[] lock = new Byte[10];
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName());
        }
    }*/

    /** 类加锁 */
    /*public void testMethod() {
        Byte[] lock = new Byte[10];
        synchronized (Sync1.class) {
            System.out.println(Thread.currentThread().getName());
        }
    }*/

}
