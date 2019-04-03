package com.exer.aop;

import com.exer.aop.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title:
 * @author: lynee
 * @DATE: 2019/4/1.
 */
public class AspectJTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Person bean2 = (Person)ac.getBean("student");
        bean2.say();
    }
}
