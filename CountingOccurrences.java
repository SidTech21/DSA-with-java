package com.siddharth;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the digit to check occurrence: ");
        int digit = input.nextInt();

        int count =0;
        while (num > 0) {
            int rem = num % 10;
            if(rem == digit){
                count++;
            }
            num= num/10;
        }
        System.out.println(count);
    }
}
