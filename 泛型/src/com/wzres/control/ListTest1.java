package com.wzres.control;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：ListTest1
 * @description：泛型限定
 * @date：2023-04-22 21:41
 */
public class ListTest1 {

    public static void main(String[] args) {
        List<Commodity> list = new ArrayList<>();
        list.add(new Commodity());
        test1(list);

        List<A> list2 = new ArrayList<>();
        //test2(list); //报错
        list2.add(new Shop());
        test2(list2);
    }

    // 泛型上限：限制泛型必须是某个类或者是其子类。泛型必须是Shop或者Shop子类
    public static void test1(List<? extends Shop> list){
        Shop shop = list.get(0);
        shop.hello();
    }



    // 泛型下限：限制泛型必须是某个类或者是其父类。泛型必须是Shop或者Shop父类
    public static void test2(List<? super Shop> list){
        //Object object = list.get(0);
        //向下转型
        Shop a = (Shop) list.get(0);
        System.out.println(a instanceof Shop);
        System.out.println(a instanceof Commodity);
        a.hello();
    }
}
class A{
    public void hello(){

    }
}

class Shop extends A{
    private String number;
    private Double price;

    Shop() {
    }

    public void hello(){

    }
}

class Commodity extends Shop{

    public Commodity() {
    }

    public void hello(){
        System.out.println("你好，我是子类");
    }
}


