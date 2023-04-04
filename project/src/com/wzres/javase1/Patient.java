package com.wzres.javase1;
/**
 * @ClassName：Cat
 * @description：病人普通类
 * @date：2023-03-30 01:56
 */
public class Patient {
   private   Register r;

    public Patient() {
    }

    public Patient(Register r) {
        this.r = r;
    }

    public Register getR() {
        return r;
    }

    public void setR(Register r) {
        this.r = r;
    }
    //开始看病
    public  void  See(){
        r.im();
        r.srg();

    }

}
