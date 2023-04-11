package com.wzres.myexception.myexception;

import java.util.Random;

/**
 * @ClassName：WZException1
 * @description：自定义异常
 * @date：2023-04-11 19:42
 */
public class WZException{
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws MyException {
        Random random = new Random(); //创建随机数对象
        int i = random.nextInt();
        if(i % 2 ==0){
            System.out.println("偶数可以正常工作");
        }else {
            throw new MyException("奇数不可以正常工作"); //如果条件满足，就创建一个编译时异常对象
        }
    }
}

class MyException extends Exception { //创建自定义的编译时异常

    public MyException() {
    }

    public MyException(String message) {
        super(message); //这行代码不能去掉，表示把我们自定义的异常信息交给父类方法打印
    }
}

class MyRuntimeException extends RuntimeException { //创建自定义的运行时异常
    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message); //这行代码不能去掉，表示把我们自定义的异常信息交给父类方法打印
    }
}






