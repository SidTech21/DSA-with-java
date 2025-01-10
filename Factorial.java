package com.siddharth;

import java.util.Scanner;

//factorial  (5! = 5 * 4 * 3 * 2 * 1 = 120)

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        int count = 1;
        while (count <= num){
            fact *= count;
            count++;
        }

        System.out.println(fact);


    }
}
