package com.exer.thread;

/**
 * Created by Administrator on 2019/4/24.
 */
public class PingPongTest {
    public static void main(String args[]) {

        Thread t = new Thread() {

            public void run() {
                pong();
            }
        };

        t.start();
//        t.run();
        System.out.print("ping");

    }

    static void pong() {

        System.out.print("pong");

    }
}
