package com.wzres.lambda;

import java.util.function.Function;

/**
 * @ClassName：LambdaTest4
 * @description：
 * @date：2023-05-01 16:16
 */
public class LambdaTest4 {
    public static void main(String[] args) {
        /*typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });*/
        Integer integer = typeConver((String s) -> {
            return Integer.valueOf(s);
        });

        System.out.println(integer);

        String s1 = typeConver(s -> s + "123");

        System.out.println(s1);

    }

    public static <R> R typeConver(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }
}
