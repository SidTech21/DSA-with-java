package com.siddharth;

import java.util.Scanner;

public class FactorialFunction {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();

        factorial(num);

    }

    static void factorial( int n){
        int fact = 1;
        for (int i = n; i > 1; --i) {
            fact *= i;
        }
        System.out.println("factorial of " + n + " is: "  + fact);
    }
}
