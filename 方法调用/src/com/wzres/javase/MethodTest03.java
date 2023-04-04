package com.wzres.javase;

/**
 * @ClassName：MethodTest03
 * @description：
 * @date：2023-04-02 00:39
 */
public class MethodTest03 {
    public static void main(String[] args) {
        School1 school1 = new School1();
        School1.setA(10);
        school1.setI(15);
        school1.test();
    }
}

class School1 {
    private int i;
    private static  int a = 25;

    public void test(){
        hello(i);
    }

    public static void hello(int i){
        System.out.println("a = " +(a+i));

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        School1.a = a;
    }
}