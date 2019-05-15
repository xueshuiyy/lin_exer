package com.exer.statictest;

import java.io.IOException;

/**
 * Created by Administrator on 2019/4/24.
 */
public class StaticTest0424 {
    public static void test() {
        System.out.println("static out");
    }

    public static void main(String[] args) {
        /*StaticTest0424 testObj = new StaticTest0424();
        testObj.test();*/
        getCustomerInfo();
    }

    public static void getCustomerInfo() {

        try {

// do something that may cause an Exception
            throw new IOException();
        } catch (java.io.FileNotFoundException ex) {

            System.out.print("FileNotFoundException!");

        } catch (java.io.IOException ex) {

            System.out.print("IOException!");

        } catch (java.lang.Exception ex) {

            System.out.print("Exception!");

        }

    }

}


