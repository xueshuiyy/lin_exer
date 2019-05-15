package com.exer.niuke;

/**
 * Created by Administrator on 2019/4/23.
 */
public class Test1 {
    public static void main(String[] args) {
        /*StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);*/


        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);

        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d);

        System.out.println("================");
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        Long u = new Long(9);
        System.out.println(s == t);

        Integer digtal = 9;
        System.out.println(s == 9);

        HaHa hh = new HaHa();

        System.out.println("================");
        boolean flag;
//        System.out.println("flag:" + getFlag(flag));
//        int a;
//        System.out.println(a);

        try {
            System.out.println("123");
        } finally {
            System.out.println("345");
        }

    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
//        x += y;
        y = x;
    }
}
