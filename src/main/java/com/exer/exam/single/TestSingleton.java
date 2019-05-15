package com.exer.exam.single;

import com.exer.exam.Singleton;

/**
 * Created by Administrator on 2019/4/23.
 */
public class TestSingleton {

    /** 方式一 */
    /*private static Singleton singleton;

    public synchronized static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /** 方式二 */
   /* private static Singleton singleton = new Singleton();
    public static Singleton getSingleton() {
        return singleton;
    }*/

    /**
     * 方式三
     */
    private volatile static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
}
