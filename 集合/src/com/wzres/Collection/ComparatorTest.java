package com.wzres.Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：CompareTest2
 * @description：②使用匿名内部类，传入一个比较器对象
 * @date：2023-05-02 18:48
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3);
        Cat cat2 = new Cat(9);
        Cat cat3 = new Cat(12);
        Cat cat4 = new Cat(5);

        Set<Cat> set = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.age - o2.age;
            }
        });
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);

        for (Cat cat : set) {
            System.out.println(cat);
        }
    }
}

class Cat{
    int age;

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }

    public Cat(int age) {
        this.age = age;
    }
}
