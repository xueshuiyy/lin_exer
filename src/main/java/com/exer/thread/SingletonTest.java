package com.exer.thread;

/**
 * Created by 杨琳 on 2019/2/12.
 */
public class SingletonTest {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("sub thread1 get Singleton instance: " + Singleton.getInstance().toString());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("sub thread2 get Singleton instance: " + Singleton.getInstance().toString());
            }
        }.start();

        System.out.println("main thread get Singleton instance: " + Singleton.getInstance().toString());
    }

    static class Singleton {
        private static Singleton singleton;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}
