package com.wzres;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName：MyTest
 * @description：
 * @date：2023-04-22 18:05
 */
public class MyTest {
    // 声明一个静态内部类
    private static class test{
        // 静态方法
        public static void m1(){
            System.out.println("静态内部类m1方法执行...");
        }

        // 实例方法
        public void m2(){
            System.out.println("静态内部类m2方法执行");
        }
    }

    public static void main(String[] args) {
        MyTest.test.m1();
        MyTest.test test = new MyTest.test();
        test.m2();

        // 创建一个Set集合
        // Set集合中存储的对象是：MyTest.test类型
        Set<MyTest.test> set1 = new HashSet<>();

        // Set集合中存储的是字符串对象
        Set<String> set2 = new HashSet<>();

        // Set集合中存储的对象是：MyMap.MyEntry类型
        Set<MyMap.MyEntry<String,Integer>> set3 = new HashSet<>();
    }
}

class MyMap{
    public static class MyEntry<K,V>{

    }
}
