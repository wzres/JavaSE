package com.wzres.Integer;

/**
 * @ClassName：IntegerTest02
 * @description：自动装箱和拆箱
 * @date：2023-04-02 06:14
 */
public class IntegerTest02 {
    public static void main(String[] args) {

        //自动装箱
        //基本数据类型➟引用数据类型
        Integer x = 900;
        System.out.println(x);//900

        //自动拆箱
        //引用数据类型➟基本数据类型
        int y = x;
        System.out.println(y);//900

        Integer z = 1000;
        System.out.println(z+1);//1001，自动拆箱：引用数据类型➟基本数据类型

        Integer a = 1200;//等同于 Integer a = new Integer(1200);a是个引用，保存内存地址指向对象
        Integer b = 1200;//等同于 Integer b = new Integer(1200);b是个引用，保存内存地址指向对象
        // ==比较的是对象的内存地址，a和b两个引用保存的对象内存地址不同
        // ==这个运算符不会触发自动拆箱机制(只有+ - * /等运算的时候才会)
        System.out.println(a==b); //false

        /*jαva中为了提高程序的执行效率，将-128到127之间所有的包装对象提前创建好
        放到了一个方法区的“整数型常量池”当中了，目的是只要用这个区间的数据不需要
        再new了，直接从整数型常量池当中取出来。*/

        //原理：×变量中保存的对象的内存地址和变量中保存的对象的内存地址是一样的。
        Integer c = 127;
        Integer d = 127;
        // ==比较的是对象的内存地址，
        System.out.println(c == d); //true

    }
}
