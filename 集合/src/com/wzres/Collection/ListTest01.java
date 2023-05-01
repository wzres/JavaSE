package com.wzres.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName：ListTest02
 * @description：
 * @date：2023-04-23 21:21
 */
public class ListTest01 {
    public static void main(String[] args) {
        // 有序可重复
        List myList = new ArrayList();
        myList.add("中国人");
        myList.add(10);
        myList.add(1);
        myList.add("中国人");
        myList.add(19);
        myList.add(1);
        
        //循环一
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        //循环二
        for (Object o : myList) {
            System.out.println(o);
        }


        System.out.println("------------------------");

        //循环三：list特有循环方式
        //get(i)
        for (int i = 0; i < myList.size(); i++) {
            Object o = myList.get(i);
            System.out.println(o);
        }
    }
}
