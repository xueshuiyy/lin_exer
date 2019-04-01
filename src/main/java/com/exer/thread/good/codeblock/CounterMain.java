package com.exer.thread.good.codeblock;

/**
 * Created by 杨琳 on 2019/2/13.
 */
public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        thread1.start();
        thread2.start();
    }
}
