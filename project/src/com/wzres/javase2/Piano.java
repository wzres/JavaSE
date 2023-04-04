package com.wzres.javase2;

/**
 * @ClassName：Piano
 * @description：钢琴
 * @date：2023-03-30 02:52
 */
public class Piano extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("弹钢琴");
    }
}
