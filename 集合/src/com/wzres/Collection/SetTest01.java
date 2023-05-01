package com.wzres.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：SetTest02
 * @description：
 * @date：2023-04-23 21:29
 */
public class SetTest01 {
    public static void main(String[] args) {
        //无序不可重复
        Set s1 = new HashSet();
        s1.add(14);
        s1.add("你好");
        s1.add(30);
        s1.add(9);
        s1.add("你好");
        s1.add(2);
        s1.add(9);
        s1.add(5);

        for (Object o : s1) {
            System.out.println(o);
        }

        System.out.println("----------------------");

        Set s2 = new TreeSet();
        //无序不可重复，会按照从小到大自动排序(仅限String、Integer)
        s2.add(14);
        //s2.add("你好");
        s2.add(30);
        s2.add(9);
        //s2.add("你好");
        s2.add(2);
        s2.add(9);
        s2.add(5);
        for (Object o : s2) {
            System.out.println(o);
        }
    }
}
