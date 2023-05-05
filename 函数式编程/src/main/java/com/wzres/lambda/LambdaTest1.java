package com.wzres.lambda;

/**
 * @ClassName：LambdaTest1
 * @description：
 * @date：2023-05-01 14:19
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.MyInstall(s->s,"华为");
    }
}

interface Apple{
    String install(String s);
}

class Phone{
    public void MyInstall(Apple a,String brand){
        System.out.println(a.install(brand)+"：正在重装苹果系统");
    }
}
