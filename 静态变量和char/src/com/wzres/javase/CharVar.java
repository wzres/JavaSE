package com.wzres.javase;

/**
 * @ClassName：charVariable
 * @description：char型
 * @date：2023-03-26 19:32
 */
public class CharVar {

    public static void main(String[] args) {
        char a = 'a';
        System.out.println("a = " + a); // a

        char b = 97;
        System.out.println("b = " + b); // a

        int c = a;

        System.out.println("c = " + c); // 97

        int d = a + 1; // 97 + 1
        System.out.println("d = " + d); // 98
    }
}
