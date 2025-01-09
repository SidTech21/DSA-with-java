package com.siddharth;

public class shadowing {
    static int x=100;
    public static void main(String[] args) {
        System.out.println(x);
        int x= 40;
        System.out.println(x);
        marks();
    }
    static void marks(){
        System.out.println(x);
    }
}
