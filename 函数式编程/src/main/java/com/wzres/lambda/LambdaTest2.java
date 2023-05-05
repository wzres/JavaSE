package com.wzres.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @ClassName：LambdaTest2
 * @description：
 * @date：2023-05-01 15:38
 */
public class LambdaTest2 {

    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void main(String[] args) {
        int i = calculateNum((left, right) -> left + right);
        System.out.println(i);
    }
}
