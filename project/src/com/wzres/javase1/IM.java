package com.wzres.javase1;

/**
 * @ClassName：Cat
 * @description：医生实现类一
 * @date：2023-03-30 01:56
 */
public class IM implements Register {
    public void im(){
        System.out.println("内科医生接诊的心脏患者");

    }
    public void srg(){
        System.out.println("内科医生接诊的癌症患者");
    }
}
