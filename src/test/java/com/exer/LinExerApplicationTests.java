package com.exer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LinExerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
		{
//        System.out.println("Hello World!");
        /* map的基本原理 */
        /*Map<String, Integer> testMap = new HashMap<String, Integer>();
        *//*for (int i=0; i<50; i++) {
            testMap.put("key" + i, i);
        }*//*
        testMap.put("A", 1);
        testMap.put("A", 2);
        System.out.println("测试:" + testMap.toString());*/

        /* 几种常见的hashmap实现类 */
        /*ConcurrentHashMap<String, Integer> testMap = new ConcurrentHashMap<String, Integer>();
        testMap.put("A", 1);*/



        /* set遍历 */
        /*Set<String> testSet = new HashSet<String>();
        testSet.add("A");
        testSet.add("B");
        testSet.add("C");
        testSet.add("D");

        Iterator<String> iterator = testSet.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        for (String s: testSet) {
            System.out.println("s:" + s);
        }*/

        /* 移位测试 */
			int a = -100;
			System.out.println("测试>>");
			System.out.println("测试 "+ a +"：" +Integer.toBinaryString(a));
			System.out.println(a + " >> 1 = " + Integer.toBinaryString(a >> 1));
			System.out.println(a + " >>> 1 = " + Integer.toBinaryString(a >>> 1));
			a = 100;
			System.out.println("测试 "+ a +"：" +Integer.toBinaryString(a));
			System.out.println(a + " >> 1 = " + Integer.toBinaryString(a >> 1));
			System.out.println(a + " >>> 1 = " + Integer.toBinaryString(a >>> 1));
        /*
        System.out.println("测试 15：" +Integer.toBinaryString(15));
        System.out.println("15 >> 1 = " + Integer.toBinaryString(15 >> 1));
        System.out.println("15 >>> 1 = " + Integer.toBinaryString(15 >>> 1));*/

			/** Object */
			Object testObj = new Object();
		}
	}

}
