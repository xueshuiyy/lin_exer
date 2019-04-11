package com.exer.newObj;

import com.exer.aop.Student;
import org.junit.Test;
import org.springframework.asm.Handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2019/4/3.
 */
public class ObjTest {

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 方式1,直接new
        /*Book book = new Book("红楼梦", "曹雪芹");*/

        // 方式2的两种方式归根结底都是实现了ConstructorAccessor接口的newInstance,都是构造函数

        // 方式2.1，用class的newinstance
        Class c1 = Class.forName("com.exer.newObj.Book");
        Constructor<Book> bookConstructor  = (Constructor<Book>) c1.getConstructor(String.class, String.class);
        Book book1 = bookConstructor.newInstance("红楼梦", "曹雪芹");

        try {
            System.out.println("try");
            throw new Exception("");
        } catch (Exception e) {
//            throw new Exception("");
        }
        // 方式2.2，用constructor的newinstance，
        /*Constructor<Book> bookConstructor = Book.class.getConstructor(String.class, String.class);
        Book book2 = bookConstructor.newInstance("红楼梦", "曹雪芹");
        book2.toString();*/

        // 方式3
       /* Book book3 = (Book) book2.clone();

        // 方式4
        ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("data.obj"));
        Book book4 = (Book) objInputStream.readObject();*/
    }
}
