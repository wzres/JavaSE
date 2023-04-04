package com.wzres.javase;

/**
 * @ClassName：JavaTest
 * @description：内部类
 * @date：2023-03-24 00:02
 */
// 外部类
class AJava<Static> {

    public AJava() {
        //外部类访问内部类必须创建对象的引用去访问属性
        BJava bJava = new BJava();
        System.out.println(bJava.a);
        System.out.println(bJava.b);
        System.out.println(bJava.c);
        System.out.println(bJava.d);
    }

    // 静态内部类
    static class BJava {
        int a = 8;
        int b = 9;
        int c = 10;
        // 静态内部类可以定义实例和静态属性
        static int d = 11;
    }

    //实例内部类
	/*class BJava{
		int a = 8;
		int b = 9;
		int c = 10;
		// 实例内部类不能定义静态属性
		static int d = 11;
	}*/

    public void hello() {
        // 局部内部类
        class D {
        }
    }

}

class Test {
    public static void main(String[] args) {
        AJava aJava = new AJava();
    }
}













