package com.exer.exam;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class Singleton {

    /** 方式一：性能不高 */
    /*private static Singleton singleton;
    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /**
     * 方式二：性能不高?
     */
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

/**
 * 方式三：双检锁
 */
    /*private volatile static Singleton singleton;
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/

}
