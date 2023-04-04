package com.wzres.interface1;

/**
 * @ClassName：InterfaceTest01
 * @description：正确的接口转型
 * @date：2023-03-30 06:24
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        A a = new C();
        //需求：调用m2方法
        //接口转型：把a转成B接口
        B b = (B)a;
        b.m2(); //编译没问题，运行也没问题，因为c实现了a也实现了b
    }
}

interface A{
    void m1();
}

interface B{
    void m2();
}

class C implements A,B{

    @Override
    public void m1() {
        System.out.println("m1...");
    }

    @Override
    public void m2() {
        System.out.println("m2...");
    }
}