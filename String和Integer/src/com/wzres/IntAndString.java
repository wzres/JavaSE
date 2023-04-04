package com.wzres;

/**
 * @ClassName：IntTest
 * @description：常量池
 * @date：2023-04-02 23:39
 */
public class IntAndString {
    public static void main(String[] args) {
    //Integer
        //整型常量池-128~127
        //自动装箱
        Integer i1 = 127;
        //自动拆箱
        int number = i1;
        System.out.println("i1 = " + i1);
        Integer i2 = 127;

        System.out.println(i1==i2);//true

        Integer i3 = new Integer(456);
        Integer i4 = new Integer(456);
        System.out.println(i3==i4); //false，new了2次，所以对象内存地址不一样
        System.out.println(i3); //456 说明Integer重写了toString
        System.out.println(i3.equals(i4));  //true 说明Integer重写了equals

    //String

        //字符串常量池
        //创建字符串常量池中对象
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);//true

        //堆内存和字符串常量池各自创建了一个对象
        String x = new String("abc");
        String y = new String("abc");
        System.out.println(x==y);//false
        boolean equals = x.equals(y);
        System.out.println("equals = " + equals);//true

    }
}
