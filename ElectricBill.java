package com.siddharth;


//For example, if your meter reading shows 500 kWh for this month and the tariff rate is ₹5 per kWh,
// your bill would be: 500 kwh * 5 rs/kwh

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        System.out.print("Enter the digit which is shown in the meter: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("Enter the rate/kwh in your side: ");
        int rupee = input.nextInt();

        int bill = num * rupee;
        System.out.print("Your electric bill is : " + bill);
    }
}
