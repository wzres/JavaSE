package com.wzres.javase;

/**
 * @ClassName：Test01
 * @description：对象的创建和使用
 * @date：2023-03-25 03:08
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer computer = new Computer();
        computer.brand = "神舟";
        computer.moder = "y7000p";

        //创建人对象
        Person person = new Person();
        person.name = "tom";
        person.age = 17;
        person.computer = computer;
        System.out.println(person.name+"有个"+person.computer.brand+"品牌"+"的电脑");

        person.computer = new Computer();
        // 第一次创建的对象实例化后并赋值，第二次创建的对象内存地址和第一次不一样，且没有赋值
        System.out.println(person.name+"有个电脑，品牌是："+person.computer.brand); //null

    }
}

// 电脑
 class Computer {
    String brand;
    String moder;
    String colour;

}

// 人类
class Person{
    String name;
    int age;
    Computer computer;
}