package com.exer.anonymous;

/**
 * Created by Administrator on 2019/4/3.
 */
public class ClassACase {
    public void sayClassHi(IACase a) {
        System.out.println("start");
        a.sayHi("test");
        System.out.println("end");
    }
}
