package com.wzres.javase;

/**
 * @ClassName：Test
 * @description：多态使用
 * @date：2023-03-30 01:56
 */
public class Test {

    public static void main(String[] args) {
        // 写法一
       /* Pet p1 = new Dog();
        Pet p2 = new Cat();
        Master master = new Master();
        master.feed(p1);
        master.feed(p2);*/

        //写法二
        Master master = new Master();
        master.feed(new Dog());
        master.feed(new Cat());
    }

}
