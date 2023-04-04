package com.wzres.javase;

/**
 * @ClassName：MethodTest02
 * @description：递归
 * @date：2023-03-31 01:24
 */
public class MethodTest02 {
    public static void main(String[] args) {
        MethodTest02 methodTest02 = new MethodTest02();
        methodTest02.m1();
    }

    public void m1(){
        System.out.println("m1...");
        m2();
    }

    public void m2(){
        System.out.println("m2...");
        m1();
    }
}

