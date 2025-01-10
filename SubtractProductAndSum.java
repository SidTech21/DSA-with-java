package com.siddharth;
//Ques.Subtract the product and sum of the digits of an integer

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int mul = 1;
        int rem;
        while(num > 0){
            rem = num % 10;
            sum += rem;
            mul *= rem;
            num /= 10;
        }
        int result = mul - sum ;
        System.out.println(result);

    }
}
