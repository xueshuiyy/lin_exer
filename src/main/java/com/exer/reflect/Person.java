package com.exer.reflect;

/**
 * Created by Administrator on 2019/3/18.
 */
public class Person {

    //私有属性
    private String name = "Lynee";
    //公有属性
    public int age = 18;

    //构造方法
    public Person() {
    }
    //构造方法
    public Person(String name, String age) {
        System.out.println("Person name: "+ name);
        System.out.println("Person age:" + age);
    }
    //构造方法
    public Person(String name) {
        System.out.println("Person name:" + name);
    }

    //私有方法
    private void say() {
        System.out.println("private say()...");
    }

    //公有方法
    public void work() {

        System.out.println("public work()...");
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void work(String hour) {
        System.out.println("public work()... and hour: " + hour);
    }
}
