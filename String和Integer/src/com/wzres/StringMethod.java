package com.wzres;

/**
 * @ClassName：StrTest2
 * @description：
 * @date：2023-04-02 01:44
 */
public class StringMethod {
    public static void main(String[] args) {
        //①
        //转换小写
        String s1 = "STring".toLowerCase();
        System.out.println(s1);//string
        //转换大写
        String s2 = "STring".toUpperCase();
        System.out.println(s2);//STRING

        //②
        //判断2个字符串是否相等
        System.out.println("Abc".equals("abc")); //false
        //判断2个字符串是否相等，忽略大小写
        System.out.println("Abc".equalsIgnoreCase("abc")); //true

        //③
        //去除前后空白
        String trim = "                    string   ".trim();
        System.out.println(trim);//string

        //④
        //判断是否为空串
        String  a = "";
        System.out.println(a.isEmpty());//true

        //⑤
        //字符串长度
        int length = "abcdef".length();//从1开始
        System.out.println(length);//6

        //⑥
        //截取字符串
        String httpStr = "http://www.baidu.com".substring(7);
        System.out.println(httpStr);//www.baidu.com
        String substring = "http://www.baidu.com".substring(7,16);
        System.out.println(substring);//ww.baidu

        //⑦
        //判断前面多的字符串是否包含后面的字符串
        System.out.println("http://www.baidu.com".contains("baidu"));//true
        System.out.println("http://www.baidu.com".contains("https"));//false

        //⑧
        //将字符串转换成byte数组
        byte[] bytes = "abc".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);//97,98,99
        }
        //将字符串转换成Cha数组
        char[] chars = "中国人".toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);//中,国,人
        }

        //⑨
        //非String转换为string，唯一一个静态方法
        String s = String.valueOf(5);
        System.out.println(s instanceof String);
    }
}
