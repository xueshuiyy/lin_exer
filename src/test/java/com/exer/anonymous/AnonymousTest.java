package com.exer.anonymous;

import org.junit.Test;

/**
 * Created by Administrator on 2019/4/3.
 */
public class AnonymousTest {
    @Test
    public void test() {
        ClassACase aCase = new ClassACase();
        aCase.sayClassHi(text -> System.out.println("aaaaaaa" + text));
        aCase.sayClassHi(text -> System.out.println("bbbbb" + text));
    }
}
