package com.siddharth;
// same functions name with different parameters
public class Overloading {
    public static void main(String[] args) {
        fun(4);
        fun("siddharth kumar");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
}
