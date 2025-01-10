package com.siddharth;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number of Elements: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double sum = 0;
        System.out.print("Enter the values: ");
        for (int i = 0; i < num; i++) {
            double values = input.nextDouble();
            sum += values;

        }
        double avg = sum/num;
        System.out.print("Average of the values is :  " + avg);
    }
}
