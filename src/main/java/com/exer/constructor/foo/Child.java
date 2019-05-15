package com.exer.constructor.foo;

/**
 * Created by Administrator on 2019/4/22.
 */
public class Child extends Parent {
    static Foo FOO = new Foo("Child's static parameter");

    Foo foo = new Foo("Child's parameter");

    static {
        System.out.println("Child's static code block");
    }

    {
        System.out.println("Child's code block");
    }

    public Child() {
        System.out.println("Child.Child()");
    }
}
