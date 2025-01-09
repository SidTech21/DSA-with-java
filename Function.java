package com.siddharth;



public class Function {
    public static void main(String[] args) {

        System.out.println("Enter numbers for swapping: ");

        swap(5, 6);

    }
    static void swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println("a: "+ a );
     System.out.println("b: "+ b);
   }
    static void change(int[] arr){
        arr[0] = 99;
    }
}