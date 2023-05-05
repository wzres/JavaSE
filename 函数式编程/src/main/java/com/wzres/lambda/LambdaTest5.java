package com.wzres.lambda;

import java.util.function.IntConsumer;

/**
 * @ClassName：LambdaTest5
 * @description：
 * @date：2023-05-01 16:52
 */
public class LambdaTest5 {
    public static void main(String[] args) {
     /*foreachArr(new IntConsumer() {
         @Override
         public void accept(int value) {
             System.out.println(value+1);
         }
     });*/

        foreachArr(value ->System.out.println(value));
    }

    public static void foreachArr(IntConsumer consumer){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }
}
