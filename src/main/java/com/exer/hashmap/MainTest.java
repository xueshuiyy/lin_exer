package com.exer.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 杨琳 on 2019/2/13.
 */
public class MainTest {
    /**
     * MapKey 设计非常巧妙，因为它的对于数字，他们的hashcode值是相同的，但是他们的key又是不同的
     * @param args
     */
    public static void main(String[] args) {
        Map<MapKey,String> map = new HashMap<MapKey, String>();
        /*
        //第一阶段
        for (int i = 0; i < 6; i++) {
            map.put(new MapKey(String.valueOf(i)), "A");
        }
        */

        //第二阶段
        for (int i = 0; i < 10; i++) {
            map.put(new MapKey(String.valueOf(i)), "A");
        }

        /*
        //第三阶段
        for (int i = 0; i < 50; i++) {
            map.put(new MapKey(String.valueOf(i)), "A");
        }
        */

        /*
        //第四阶段
        map.put(new MapKey("X"), "B");
        map.put(new MapKey("Y"), "B");
        map.put(new MapKey("Z"), "B");
        */
        System.out.println(map);
    }
   /* public static void main(String[] args) {
        System.out.println("LinkedHashMap 根据插入顺序排列：");
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (Integer i = 0; i < 5; i++) {
            map.put("k" + i.toString(), "v" + i.toString());
        }

        for (Integer i = 10; i > 5; i--) {
            map.put("k" + i.toString(), "v" + i.toString());
        }

        System.out.println(map);
        map.get("k10");
        System.out.println(map);

        System.out.println("LinkedHashMap 根据最近最少使用(Least Recently Used)顺序排列：");
        map = new LinkedHashMap<String, String>(16, 0.75f, true);
        // 没有了其他构造方法设置其排序为true了。初始容量、加载因子使用默认的16和0.75。
        for (Integer i = 0; i < 5; i++) {
            map.put("k" + i.toString(), "v" + i.toString());
        }

        for (Integer i = 10; i > 5; i--) {
            map.put("k" + i.toString(), "v" + i.toString());
        }

        System.out.println(map);
        map.get("k10");
        System.out.println(map);
    }
*/

}
