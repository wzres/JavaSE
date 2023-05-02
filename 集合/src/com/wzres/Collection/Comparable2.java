package com.wzres.Collection;

import java.util.TreeSet;

/**
 * @ClassName：Comparable2
 * @description：①实现Comparable方式
 * @date：2023-05-02 12:16
 */
//需求：先按照年龄升序，如果年龄相同，再按照名字升序
public class Comparable2 {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();
        s.add(new Student(14, "zhangsan"));
        s.add(new Student(17, "wangwu"));
        s.add(new Student(14, "zhaoliu"));
        s.add(new Student(19, "lisi"));

        for (Student student : s) {
            System.out.println(student);
        }

    }

}

/*
compareTo方法的返回值很重要：
	返回0表示相同，value会盖。
	返回>0，会继续在右子树上找。【10 - 9 = 1，1 > 0的说明左边这个数字比较大。所以在右子树上找】
	返回<0，会继续在左子树上找。
 */

class Student implements Comparable<Student>{
    int age;
    String username;

    public Student(int age, String username) {
        this.age = age;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age==o.age){
            //年龄相同时按照名字排序。
            //姓名是String类型，可以直接比。调用compareTo来完成比较。
            return this.username.compareTo(o.username);
        }else
            //年龄不一样
           return this.age-o.age;
    }
}
