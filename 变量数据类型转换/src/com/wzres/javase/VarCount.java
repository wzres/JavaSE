package com.wzres.javase;

/**
 * @ClassName：VarCount
 * @description：
 * @date：2023-03-30 00:48
 */
public class VarCount {
    public static void main(String[] args) {
        byte by = (byte) 128; //128被int类型处理，字面值已超byte范围，需要手动强转

        //int k = (int)2147483648; //编译错误，2147483648被int类型处理，字面值已超int存储范围

        // 小容量 ➟ 大容量

        float f1 = 10; //int提升到float
        System.out.println("f1 = " + f1); //10.0

        int a = 10;
        long l = a; //int提升到long

        long b = 10L;
        double d = b + 5; //long提升到double
        System.out.println("d = " + d);//15.0

        // 大容量 ➟ 小容量

        byte b1 = 10;
        byte b2 = (byte) (b1 + 5); //byte和任何整数字面值计算都int型，int强转成byte

        int in = 10;
        byte by1 = (byte) in; //int强转成byte

        float f = (float) 10.5; //double强转成float
    }
}
