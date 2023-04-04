package com.wzres.javase2;

/**
 * @ClassName：InstrumentTest
 * @description：
 * @date：2023-03-30 02:54
 */
public class InstrumentTest {
    public static void main(String[] args) {
        Musician m1 = new Musician(new Erhu());
        Musician m2 = new Musician(new Piano());
        m1.play();
        m2.play();
    }
}
