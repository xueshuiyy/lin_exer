package com.exer.reflect.owntest;

import com.exer.reflect.Person;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/18.
 */
public class OwnTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        Class sss = Class.forName("reflect.Person");
        Method[] methods = sss.getMethods();
        for (Method b : methods) {
            System.out.println(b.getName());
        }
        System.out.println("-----------------");
        Method[] methods123 = sss.getDeclaredMethods();
        for (Method method : methods123) {
            System.out.println(method.getName() + " " + Modifier.isPublic(method.getModifiers()));
        }
        System.out.println("-----------------------");
//        System.out.println(sss.getMethod("work", String.class));

        Field[] field = sss.getDeclaredFields();
        for (Field field1 : field) {
            System.out.println(field1.getName());
        }
        System.out.println("----------------------");
        System.out.println(sss.getMethod("work"));
        System.out.println("----------------------");
        System.out.println(sss.getField("age"));
//        System.out.println(sss.getField("name"));

        System.out.println("----------------------");
        try {
            Object s = sss.newInstance();
            Field fAge = sss.getField("age");
            fAge.set(s, 36);
            System.out.println(fAge.get(s));
            Field fName = sss.getDeclaredField("name");
            fName.setAccessible(true);
            fName.set(s, "Honey");
            System.out.println(fName.get(s));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Constructor[] constructors = sss.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("---");
            System.out.println(constructor.getName());
            Class[] parameters = constructor.getParameterTypes();
            for (Class parameter : parameters) {
                System.out.println("parameter:" + parameter);
            }
        }
        System.out.println("===============");
        Person personSrc = new Person();
        personSrc.setAge(100);
//        personSrc.setName("Alex");
        Person persontar = new Person();
        BeanUtils.copyProperties(personSrc, persontar);

//        System.out.println("personSrc:" + persontar.getName() + " ," + persontar.getAge());
        Map<String, String> test = new HashMap<String, String>();
    }
}
