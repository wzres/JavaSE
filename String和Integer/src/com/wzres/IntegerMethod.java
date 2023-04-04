package com.wzres;

/**
 * @ClassName：IntegerMethod
 * @description：
 * @date：2023-04-03 00:10
 */
public class IntegerMethod {
    public static void main(String[] args) {
        // int ➟ Integer
        Integer i = 127;
        // Integer ➟ int
        int x = i;
        System.out.println();

        // String ➟ Integer
        Integer integer = Integer.valueOf("123");

        //Integer ➟ String
        String s = String.valueOf(123);

        // String ➟ int
        int i1 = Integer.parseInt("456");

        // int ➟ String
        String s1 = String.valueOf(123);
        int i2 = 1;
        String s2 = i2 +"";

    }
}
