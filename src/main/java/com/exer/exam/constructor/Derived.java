package com.exer.exam.constructor;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class Derived extends Base{

    private String name = "derived";

    public Derived() {
        tellName();
        printName();
    }
    public void tellName() {
        System.out.println("Derived tell name: " + name);
    }
    public void printName() {
        System.out.println("Derived print name: " + name);
    }

    public static void main(String[] args){
        new Derived();
    }
}
