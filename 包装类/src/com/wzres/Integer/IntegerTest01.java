package com.wzres.Integer;

/**
 * @ClassName：IntegerTest01
 * @description：手动装箱和拆箱
 * @date：2023-04-02 06:14
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //Integer构造方法
        //new Integer(int)
        //new Integer(String)

        //手动装箱
        //int ➟ Integer;
        Integer i = new Integer(128);

        //手动装箱
        //String ➟ Integer
        String s = Integer.toBinaryString(400);

        //手动拆箱
        //Integer ➟ int
        int i1 = i.intValue();//128
        //Integer ➟ byte(超byte范围，自动强转成byte)
        byte b = i.byteValue();
        System.out.println(b);//-128
    }
}
