package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName：Exception
 * @description：异常捕捉
 * @date：2023-04-11 19:04
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        example(); //因为example方法自己try catch捕捉处理了异常，所以调用者不需要在做处理
        catchs1();
        catchs2();
    }

    public static void example(){ //编译时异常 在example方法做捕捉处理
        try {
            FileInputStream fileInputStream = new FileInputStream("123"); //编译时异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 多种异常捕捉方式一

    public static void catchs1(){
        try {
            FileInputStream fileInputStream = new FileInputStream("123");
            SimpleDateFormat s = new SimpleDateFormat();
            s.parse("123");
            System.out.println(1); //如果上面出现异常，该代码不会输出，并把异常赋值给Exception，执行catch的语句
        } catch (Exception e) { //Exception是所有异常的父类，任意的异常都能被捕捉
            e.printStackTrace();
            System.out.println("异常出现了...");
        }
        //捕捉异常和声明抛出(直到抛给JVM)，区别是：捕捉异常还会继续执行代码，一直上抛，JVM会结束退出程序，异常之后的代码不会执行
        System.out.println(2); //不管上面是否出现异常，该代码必然执行。
    }

    // 多种异常捕捉方式二

    public static void catchs2(){
        try {
            FileInputStream fileInputStream = new FileInputStream("123");
            SimpleDateFormat s = new SimpleDateFormat();
            s.parse("123");
        } catch (FileNotFoundException e) { //捕捉FileNotFoundException异常
            e.printStackTrace();
        } catch (ParseException e) { //捕捉ParseException异常
            e.printStackTrace();
        }
    }


}
