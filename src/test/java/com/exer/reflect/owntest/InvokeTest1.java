package com.exer.reflect.owntest;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/3/18.
 */
public class InvokeTest1 extends TestCase {

    public void soutStr(String[] arg) {
        for (String s: arg) {
            System.out.println(s);
        }
    }

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<InvokeTest1> classT = (Class<InvokeTest1>) Class.forName("reflect.owntest.InvokeTest1");
        InvokeTest1 obj0 =  classT.getConstructor().newInstance();

        String[] testStr = {"1", "2", "3"};

        Method soutStr = classT.getMethod("soutStr", String[].class);
        // 执行下面的方法会报错java.lang.IllegalArgumentException: wrong number of arguments
//        soutStr.invoke(obj0, testStr);
        // 要改成下面的二选一的方式
        soutStr.invoke(obj0, new Object[]{testStr});
        soutStr.invoke(obj0, (Object) testStr);

//        String[] test1 = new String[]{"1", "2", "3"};

    }


}