package com.exer.exam;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class ExamMain {
    public static void main(String args[]) {

        /*Thread t = new Thread() {

            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");

        Float f = Float.parseFloat("1");
        f = 4F;*/

//        int s;
//        Integer s;

//        System.out.println("s=" + s);
//        AbstractTest t1 = new AbstractTest();

//        String test = "12";
        System.out.println("main方法结果：" + testFinally());
    }

    // finally 会覆盖
    public static int testFinally() {
        int a = 1;
        try {
            a++;
            System.out.println("a=" + a);
            return a;
        } catch (Exception e) {

        } finally {
            a++;
            System.out.println("a=" + a);
//            return "2";
        }
        return a;
    }
    static void pong() {

        System.out.print("pong");

    }
}
