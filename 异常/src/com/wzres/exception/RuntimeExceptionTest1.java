package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName：RuntimeExceptionTest1
 * @description：异常抛出
 * @date：2023-04-11 18:46
 */
public class RuntimeExceptionTest1 { //最终抛给JVM虚拟机
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        hello(); //抛给调用者，让调用者来处理这个异常

    }

    public static void hello() throws FileNotFoundException { //编译时异常，如果不想在hello方法做处理，可以声明抛出给调用者
        FileInputStream aaa = new FileInputStream("aaa"); //编译时异常
    }

    public static void test1() throws FileNotFoundException, ParseException {
        test();
    }

    //多种异常抛出
    public static void test() throws FileNotFoundException, ParseException { //编译时异常，抛出多种异常给调用者
        FileInputStream aaa = new FileInputStream("aaa"); //编译时异常
        SimpleDateFormat s = new SimpleDateFormat();
        s.parse("456"); //编译时异常
    }

}


