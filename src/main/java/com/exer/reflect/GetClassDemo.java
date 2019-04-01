package com.exer.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/3/18.
 */
public class GetClassDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        //1、通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object
        //  类型的对象，而我不知道你具体是什么类，用这种方法
        Person p1 = new Person();
        Class c1 = p1.getClass();

        //2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
        //  这说明任何一个类都有一个隐含的静态成员变量 class
        Class c2 = Person.class;

        //3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
        //   但可能抛出 ClassNotFoundException 异常
        try {
            Class c3 = Class.forName("reflex.Person");
        } catch (ClassNotFoundException e) {

        }

        //获得类完整的名字
        String className = c2.getName();
        System.out.println(className);//输出reflect.Person
        System.out.println("---------------------------");
        //获得类的public类型的属性。
        Field[] fields = c2.getFields();
        System.out.println("getFields()");
        for (Field field : fields) {
            System.out.println(field.getName());// age
        }

        //获得类的所有属性。包括私有的
        System.out.println("---------------------------");
        System.out.println("getDeclaredFields()");
        Field[] allFields = c2.getDeclaredFields();
        for (Field field:allFields) {
            System.out.println(field.getName());//name    age
        }

        //获得类的public类型的方法。这里包括 Object 类的一些方法
        System.out.println("---------------------------");
        System.out.println("getMethods()");
        Method[] methods = c2.getMethods();
        for (Method method :methods) {
            System.out.println(method.getName());//work wait*=3 equals toString hashCode等
        }

        //获得类的所有方法。
        System.out.println("---------------------------");
        System.out.println("getDeclaredMethods()");
        Method[] allMethods = c2.getDeclaredMethods();
        for (Method method:allMethods) {
            System.out.println(method.getName());//work say
        }

        //获得指定的属性
        System.out.println("---------------------------");
        Field f1 = c2.getField("age");
        System.out.println("getField(age):" + f1);
        //获得指定的私有属性
        Field f2 = c2.getDeclaredField("name");
        //启用和禁用访问安全检查的开关，值为 true，则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
        f2.setAccessible(true);
        System.out.println("getDeclaredField(name):" + f2);

        //创建这个类的一个对象
        Object p2 = c2.newInstance();
        //将 p2 对象的  f2 属性赋值为 Bob，f2 属性即为 私有属性 name
        f2.set(p2, "Bob");
        //使用反射机制可以打破封装性，导致了java对象的属性不安全。
        System.out.println(f2.get(p2)); //Bob
        System.out.println("---------------------------");

        //获取构造方法
        Constructor[] constructors = c2.getConstructors();
        for (Constructor constructor :constructors) {
            System.out.println(constructor.toString());//public reflect.Person()
        }
    }


}
