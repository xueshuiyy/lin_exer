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
        System.out.println(testFinally());
    }

    // finally 会覆盖
    public static String testFinally() {
        try {
            return "1";

        } catch (Exception e) {

        } finally {
            return "2";
        }

    }
    static void pong() {

        System.out.print("pong");

    }
}
