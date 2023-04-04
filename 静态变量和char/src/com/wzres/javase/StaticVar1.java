package com.wzres.javase;

import static com.wzres.javase.StaticVar.hello;

/**
 * @ClassName：StaticVar1
 * @description：测试静态变量能否在同一个包访问
 * @date：2023-03-29 05:54
 */
public class StaticVar1 {
    public static void main(String[] args) {
        //不加public修饰的情况：
        // 默认只能在同一个包访问，如果不再同一个包下，则需要导包
        // 跨类不是同一个包下，所以需要导包
        System.out.println(hello);
    }
}
