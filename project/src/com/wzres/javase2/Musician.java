package com.wzres.javase2;

import com.sun.media.jfxmedia.events.PlayerEvent;

/**
 * @ClassName：Musician
 * @description：乐手类
 * @date：2023-03-30 02:52
 */
public class Musician {
    private  Instrument i;

    public Musician(Instrument i) {
        this.i = i;
    }

    public void play(){
        i.makeSound();
    }
}
