package com.exer.constructor.foo;

/**
 * Created by Administrator on 2019/4/22.
 */
public class Parent {
    static Foo FOO = new Foo("Parent's static parameter");

    Foo foo = new Foo("Parent's parameter");

    static {
        System.out.println("Parent's static code block");
    }

    {
        System.out.println("Parent's code block");
    }

    public Parent() {
        System.out.println("Parent.Parent()");
    }
}
