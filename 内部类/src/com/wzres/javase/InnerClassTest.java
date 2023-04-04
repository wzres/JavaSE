package com.wzres.javase;

/**
 * @ClassName：JavaTest
 * @description：内部类进阶
 * @date：2023-03-24 00:02
 */
public class InnerClassTest {

    public int field1 = 6;
    protected int field2 = 7;
    int field3 = 8;
    private int field4 = 9;

    public InnerClassTest() {
        // 在外部类对象内部，直接通过 new InnerClass(); 创建内部类对象
        InnerClassA innerObj = new InnerClassA();
        System.out.println("创建 " + this.getClass().getSimpleName() + " 对象");
        System.out.println("其内部类的 field1 字段的值为: " + this.field1);
        System.out.println("其内部类的 field2 字段的值为: " + this.field2);
        System.out.println("其内部类的 field3 字段的值为: " + this.field3);
        System.out.println("其内部类的 field4 字段的值为: " + this.field4);
    }

    public class InnerClassA {
        public int field1 = 1;
        protected int field2 = 2;
        int field3 = 3;
        private int field4 = 4;
//        static int field5 = 5; // 编译错误！普通内部类中不能定义 static 属性

        public InnerClassA() {
            System.out.println("我被输出了...");
            System.out.println("创建 " + this.getClass().getSimpleName() + " 对象");
            System.out.println("其外部类的 field1 字段的值为: " + field1);
            System.out.println("其外部类的 field2 字段的值为: " + field2);
            System.out.println("其外部类的 field3 字段的值为: " + field3);
            System.out.println("其外部类的 field4 字段的值为: " + field4);
        }
    }

    public static void main(String[] args) {
        InnerClassTest outerObj = new InnerClassTest();
        // 不在外部类内部，使用：外部类对象. new 内部类构造器(); 的方式创建内部类对象
//        InnerClassA innerObj = outerObj.new InnerClassA();
    }
}