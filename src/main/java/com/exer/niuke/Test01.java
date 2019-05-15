package com.exer.niuke;

/**
 * Created by Administrator on 2019/4/23.
 */
class Base {
    public void method() {
        System.out.println("Base");
    }
}

class Son extends Base {
    public void method() {
        System.out.println("Son");
    }

    public void methodB() {
        System.out.println("SonB");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Base base = new Son();
        base.method();
//        base.methodB();
    }
}