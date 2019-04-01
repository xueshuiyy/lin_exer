package com.exer.reflect.owntest;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/3/18.
 */
public class Msym {


    public void test(String[] arg) {
        for (String string : arg) {
            System.out.println(string);
        }
    }

    @Test
    public void demo1() throws Exception {
        //获取字节码对象
        Class<Msym> clazz = (Class<Msym>) Class.forName("reflect.owntest.Msym");
        //获取一个对象
        Constructor con = clazz.getConstructor();
        Msym m = (Msym) con.newInstance();
        String[] s = new String[]{"aa", "bb"};
        //获取Method对象
        Method method = clazz.getMethod("test", String[].class);
        //调用invoke方法来调用
//        method.invoke(m, s);
        method.invoke(m, new Object[]{s});
    }

}
