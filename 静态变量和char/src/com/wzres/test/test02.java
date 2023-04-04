package com.wzres.test;

import static com.wzres.javase.StaticVar.hello;

/**
 * @ClassName：test02
 * @description：测试静态变量能否在其他包访问
 * @date：2023-03-27 04:14
 */
public class test02 {
    public static void main(String[] args) {
        // 需要加public 公开以及导包
        System.out.println(hello);
    }
}
