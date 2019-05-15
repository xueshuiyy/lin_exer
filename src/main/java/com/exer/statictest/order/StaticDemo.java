package com.exer.statictest.order;

/**
 * Created by Administrator on 2019/4/22.
 */
class StaticTestA{

    //静态代码块
    static {
        System.out.println("父类静态代码块被执行");
    }

    //非静态代码块
    {
        System.out.println("父类非静态代码块被执行");
    }
    //构造方法
    StaticTestA(){

        System.out.println("父类构造方法被执行");
    }
}
public class StaticDemo extends StaticTestA {

    static {

        System.out.println("子类静态代码块被执行");
    }
    //非静态代码块
    {
        System.out.println("子类非静态代码块被执行");
    }
    StaticDemo(){
        System.out.println("子类构造方法被执行");
    }

    public static void main(String[] hq){
        new StaticDemo();
        System.out.println("main函数");
    }
}
