package com.wzres.javase1;

public class Test008 {
    public static void main(String[] args) {
        Register r1 = new Surgery();
        Patient  p1 = new Patient(r1);
        p1.See();
    }
}
