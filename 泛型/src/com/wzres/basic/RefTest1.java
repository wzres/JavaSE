package com.wzres.basic;

/**
 * @ClassName：RefTest1
 * @description：泛型类
 * @date：2023-04-22 18:45
 */
public class RefTest1<T>{ //定义泛型

    T name; //使用泛型

    //泛型：用于标识引用数据类型

    //为什么只有实例方法的参数才能使用泛型，因为静态方法调用不需要创建对象

    public void m1(T t){ //使用泛型
        this.name = t;
        System.out.println(t);
    }
    //什么时候确定泛型？
    public static void main(String[] args) {
    //①. 在创建对象的时候来声明这个泛型的数据类型
        RefTest1<String> ref = new RefTest1<>();
        ref.m1("123");
        System.out.println(ref.name);
    }
}

class SonRef1 extends RefTest1<Integer>{
    //②.在子类继承父类的时候确定父类的泛型
}

class SonRef2<T> extends RefTest1<T>{
    //③.定义子类时也可以选择不确定泛型，让其在创建对象的时候统一确定

    public static void main(String[] args) {
        // 确定子类和父类的引用数据类型都为boolean类型
        SonRef2<Boolean> sonRef2 = new SonRef2<>();
        sonRef2.m1(10>3);

        // 确定子类和父类的引用数据类型都为boolean类型(多态)
        RefTest1<Integer> refTest1 = new SonRef2<>();
        refTest1.m1(10);
    }
}




