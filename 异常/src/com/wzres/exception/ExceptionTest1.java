package com.wzres.exception;

/**
 * @ClassName：ExceptionTest1
 * @description：运行时异常
 * @date：2023-04-11 20:42
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        //捕捉运行时异常
        try {
            test(); //这里真的出现异常了，执行catch语句块里的代码
        } catch (Exception e) {
            System.out.println("出异常了");
            e.printStackTrace(); //打印异常信息
        }
    }

    private static void test() {
        String s = null;
        System.out.println(s.length());
    }
}
