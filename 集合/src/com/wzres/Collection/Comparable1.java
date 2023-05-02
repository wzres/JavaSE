package com.wzres.Collection;

import java.util.TreeSet;

/**
 * @ClassName：Comparator1
 * @description：比较器基础
 * @date：2023-05-02 12:04
 */

//需求：按照年龄升序
public class Comparable1 {
    public static void main(String[] args) {
        TreeSet<Person> p = new TreeSet<>();
        p.add(new Person(1));
        p.add(new Person(12));
        p.add(new Person(14));
        p.add(new Person(15));
        p.add(new Person(7));

        for (Person person : p) {
            System.out.println(person);
        }
    }
}

//放在TreeSet.集合中的元素需要实现Comparable接口。
//并且实现compareTo方法指定比较规则。equals可以不写。
class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //拿着比较器的key和集合中每一个k进行比较，返回值可能是>0 <0 =0
        // >0 左边比右边大 ...

        return this.age - o.age; //升序

        //return o.age - this.age; //降序

    }
}
