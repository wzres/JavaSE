package com.wzres.Collection;

import java.util.*;

/**
 * @ClassName：CollectionsTest
 * @description：
 * @date：2023-05-02 20:13
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("abz");
        s.add("abe");
        s.add("abv");
        s.add("abd");
        s.add("abd");
        s.add("abc");

        //变成线程安全
        Collections.synchronizedList(s);

        //排序
        //集合元素存储自定义的类型，要求该类型必须实现Comparable接口
        //集合中的元素是String类型，已经实现Comparable接口
        Collections.sort(s);

        for (String s1 : s) {
            System.out.println(s1);
        }

        List<User> list = new ArrayList<>();
        list.add(new User(20));
        list.add(new User(17));
        list.add(new User(19));
        list.add(new User(12));

        //集合中的元素是User，需要实现Comparable接口才能排序
        Collections.sort(list);

        for (User user : list) {
            System.out.println(user);
        }

        //Set集合要想排序必须先转换成List集合

        Set<Integer> set = new HashSet<>();
        set.add(9);
        set.add(7);
        set.add(2);
        set.add(8);
        set.add(5);
        set.add(4);

        List<Integer> list1 = new ArrayList<>(set);

        Collections.sort(list1);

        for (Integer integer : list1) {
            System.out.println(integer);
        }

    }
}

class User implements Comparable<User>{
    int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }
}
