package com.wzres.basic;

/**
 * @ClassName：InterfaceTest1
 * @description：泛型接口
 * @date：2023-04-22 21:08
 */
public class InterfaceTest1 {

    public static void main(String[] args) {
        //多态
        Computer<Integer> c = new ComputerImpl2<>();
        c.test(1);
    }


}

interface Computer<T>{
    void test(T t);
}

class ComputerImpl implements Computer<String>{
    @Override
    public void test(String s) {
        System.out.println(s);
    }
}

class ComputerImpl2<T> implements Computer<T>{

    @Override
    public void test(T t) {
        System.out.println(t);
    }
}


