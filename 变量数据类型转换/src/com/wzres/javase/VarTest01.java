package com.wzres.javase;

/**
 * @ClassName：VarTest03
 * @description：进制转换
 * @date：2023-04-02 00:10
 */
public class VarTest01 {

    public static void main(String[] args) {
        int i = 0b0011111;
        int i1 = 0237;
        int i3 = 110;
        int i4 = 0x4e;

        System.out.println(i);//31
        System.out.println(i1);//159
        System.out.println(i3);//110
        System.out.println(i4);//78

        int n1 = 0b10111011;
        int n2 = 0457;
        int n3 = 456;
        int n4 = 0xdd9;
        System.out.println(n1);//187
        System.out.println(n2);//303
        System.out.println(n3);//456
        System.out.println(n4);//3545
    }


}
