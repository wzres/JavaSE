package com.wzres.basic;

/**
 * @ClassName：MethodTest1
 * @description：泛型方法
 * @date：2023-04-22 21:01
 */
public class MethodTest1 {
    public static void main(String[] args) {
        // 确定泛型(自动推导数据类型)
        String test = test("123");
        Integer test1 = test(123);
        Object test2 = test(new Object());

        MethodTest1 methodTest1 = new MethodTest1();
        Boolean [] array = {true,false};
        Boolean[] hello = methodTest1.hello(array);

    }

    // <T> 定义泛型  T：使用泛型
    public static <T> T test(T t){
        return t;
    }

    public <T> T [] hello(T[] t){
        return t;
    }
}
