package com.exer.thread;

/**
 * Created by 杨琳 on 2019/2/12.
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        final ObjTest objTest = new ObjTest();
        if(objTest != null){ // 为了防止线程里的代码先于上一行代码执行
            new Thread() {
                @Override
                public void run() {
                    System.out.println("sub thread1 get instance: " + objTest.getInstance().toString());
                }
            }.start();

            new Thread() {
                @Override
                public void run() {
                    System.out.println("sub thread2 get instance: " + objTest.getInstance().toString());
                }
            }.start();

            new Thread() {
                @Override
                public void run() {
                    System.out.println("sub thread3 get instance: " + objTest.getInstance().toString());
                }
            }.start();

            new Thread() {
                @Override
                public void run() {
                    System.out.println("sub thread4 get instance: " + objTest.getInstance().toString());
                }
            }.start();

            System.out.println("main thread get instance: " + objTest.getInstance().toString());
        }
    }

    static class ObjTest {
        private Object object;

        public ObjTest() {
        }

        public Object getInstance() {
            if (object == null) {
                object = new Object();
            }
            return object;
        }
    }
}
/*
反复执行会有一次发现instance不一致的时候
    sub thread1 get instance: java.lang.Object@3de4885d
        sub thread2 get instance: java.lang.Object@60cb300b
        sub thread3 get instance: java.lang.Object@60cb300b
        main thread get instance: java.lang.Object@60cb300b
        sub thread4 get instance: java.lang.Object@60cb300b*/
