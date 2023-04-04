package com.wzres.interface1;

/**
 * @ClassName：InterfaceTest02
 * @description：错误的接口转型
 * @date：2023-03-30 06:29
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        Y y = new Z();
        //X x = (X)y; //编译没问题，但运行出现ClassCastException异常。因为Z并未实现X
        //x.m1();
        if(y instanceof X){ //需要用instanceof判断
            X x = (X)y;
            x.m1();
        }
    }
}

interface X{
    void m1();
}

interface Y{
    void m2();
}

class Z implements Y{

    @Override
    public void m2() {
        System.out.println("m2...");
    }
}
