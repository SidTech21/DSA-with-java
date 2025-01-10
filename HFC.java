package com.siddharth;

import java.util.Scanner;

public class HFC {
    public static void main(String[] args) {
        System.out.println("Enter two numbers for finding HCF");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        while(num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num1);
    }
}


