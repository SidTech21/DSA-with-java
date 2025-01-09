package com.siddharth;
// reverse the random numbers
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.print("Enter A random number: ");
        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;

        while(num > 0){
            int rem = num %10;
            num /= 10; //This line divides num by 10 and assigns the quotient back to num.
            // This effectively removes the last digit of num
            ans = ans * 10 + rem;
        }
        System.out.println("Reversed number is: " + ans);


    }
}
