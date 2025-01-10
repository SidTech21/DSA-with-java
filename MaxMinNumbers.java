package com.siddharth;

//Define two methods to print the maximum and the minimum number respectively among three
// numbers entered by the user.

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the numbers for finding max and min");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = sc.nextInt();
        System.out.print("Enter the num2: ");
        int b = sc.nextInt();
        System.out.print("Enter the num3: ");
        int c = sc.nextInt();


        maxm(a, b, c);
        minm(a, b, c);


    }
    static void maxm(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max ){
            max = c;
        }
        System.out.println(max);
    }

    static void minm(int a , int b , int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println(min);
    }

}
