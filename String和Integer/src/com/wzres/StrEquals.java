package com.wzres;

/**
 * @ClassName：StrTest
 * @description：
 * @date：2023-04-02 01:07
 */
public class StrEquals {
    public static void main(String[] args) {
        String a1 = "a1";
        String a2 = "a1";
        System.out.println(a1==a2);//true

        String h1 = new String("xyz");
        String h2 = new String("xyz");
        System.out.println(h1==h2); //false

        //String重写了toString和equals，所以比较对象内容应该用equals
        boolean equals = h2.equals(h2);
        System.out.println(equals);

        //byte数组创建String对象
        byte [] bytes = {97,98,99};
        String str = new String(bytes);
        System.out.println(str);//abc

        char [] chars = {97,98,99};
        String str1 = new String(chars);
        System.out.println(str1);//abc
        System.out.println(str.equals(str1));//true

    }
}
