package com.exer.reflect;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2019/4/4.
 */
public class GetTestDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Person p1 = new Person();
        Class<? extends Person> aClass = p1.getClass();
        Method workM = aClass.getDeclaredMethod("work", String.class);
        if(!Modifier.isPublic(workM.getModifiers())) {
            workM.setAccessible(true);
        }
        workM.invoke(p1, "50");
//        BeanUtils.copyProperties();
        /*for (Method method : aClass.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        for (Constructor arg : aClass.getDeclaredConstructors()) {
            System.out.println(arg.getName());
        }
        System.out.println("-------------------------------");
        Constructor<? extends Person> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Person lucy = declaredConstructor.newInstance("Lucy");*/
    }
}
