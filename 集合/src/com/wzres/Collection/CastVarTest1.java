package com.wzres.Collection;

import java.util.*;

/**
 * @ClassName：CastVarTest1
 * @description：①实现Comparable方式
 * @date：2023-05-02 12:54
 */
public class CastVarTest1 {
    public static void main(String[] args) {
        // ①
        List<String> list1 = new ArrayList<>(Arrays.asList("1","2")); //可变长参数
        System.out.println(list1);  //[1,2]

        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{1,5,7})); //传入一个数组
        System.out.println(list2); //[1,5,7]

        String str [] = {"a","b"};

        List<String> list3 = new ArrayList<>(Arrays.asList(str)); //传入一个数组
        System.out.println(list3);//[a,b]

        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");

        List list4 = new ArrayList(Arrays.asList(s)); //如果传入一个集合，就不能使用泛型
        for (Object o : list4) {
            System.out.println(o); //[a,b,c]
        }

        //将HashSet集合转换成ArrayList集合
        List<String> list5 = new ArrayList(s); //可以
        for (String s1 : list5) {
            System.out.println(s1); //a,b,c
        }
    }
}

