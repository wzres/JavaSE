package com.wzres.javase;

/**
 * @ClassName：MethodTest
 * @description：
 * @date：2023-03-31 01:13
 */
public class MethodTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(5);
        student.setName("张三");
        System.out.println("------------------------------");
        student.m1();
        School.m2();
    }
}

class Student{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void m1(){
        System.out.println("m1...");
        System.out.println(id);
        System.out.println(name);
    }
}

class School{
    static int i = 10;
    public static void m2(){
        System.out.println("m2...");
        System.out.println(i);
    }
}
