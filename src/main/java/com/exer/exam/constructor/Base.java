package com.exer.exam.constructor;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class Base {
    private String name = "base";

    Base() {
        tellName();
        printName();
    }
    public void tellName() {
        System.out.println("Base tell name: " + name);
    }
    public void printName() {
        System.out.println("Base print name: " + name);
    }
}
