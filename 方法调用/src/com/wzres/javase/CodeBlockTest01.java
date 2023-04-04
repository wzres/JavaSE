package com.wzres.javase;

/**
 * @ClassName：CodeBlockTest
 * @description：
 * @date：2023-03-31 01:20
 */
public class CodeBlockTest01 {

    static int i = 10;
    static {
        System.out.println("static...1");
        System.out.println("static...2");
        System.out.println("static...3");
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("main...");
    }
}
