package com.wzres;

/**
 * @ClassName：AbstractTest
 * @description：抽象类
 * @date：2023-03-30 04:10
 */

public class AbstractTest001 {
    public static void main(String[] args) {

        School school = new Student();//多态
        school.studay(); //面向抽象编程

    }
}

//抽象类
abstract class School {
    //抽象无参构造
    public School() {
        System.out.println("抽象类的无参构造执行了...");
    }

    //非抽象方法
    public void test(){

    }

    //抽象方法
    public abstract void studay();
}

//子类
class Student extends School {
    public Student() {
        //底层会自动调用父类无参构造
    }

    // 子类必须实现抽象方法
    @Override
    public void studay() {
        System.out.println("学生在学习");
    }
}


