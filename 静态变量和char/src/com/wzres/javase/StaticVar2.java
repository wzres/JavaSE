package com.wzres.javase;

/**
 * @ClassName：StaticVar2
 * @description：
 * @date：2023-05-02 16:45
 */
public class StaticVar2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.ID = 1235L;
        s.username = "张三";
        s.m1();
        s.m2("李四");
        /*s.ID = 1235L;
        s.username = "张三";
        System.out.println(Student.nationality);
        System.out.println(s.ID+s.username+Student.nationality);*/
    }
}

class Student{
    public static String nationality = "中国";
    Long ID;
    String username;

    public static void Nat(){
        System.out.println(nationality);
    }

    public void m1(){
        System.out.println(ID+username);
        Nat();
    }


    public void m2(String username) {
        this.username = username;
        System.out.println(this.username);
    }
}

