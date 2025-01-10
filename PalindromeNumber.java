package com.siddharth;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Function call
        palindrome(num);

    }
    static void palindrome(int n){
        int original = n;
        int rem ;
        int ans = 0;
        while(n >0){
            rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        if( ans == original) {
            System.out.println("The given number is a palindrome");
        }else{
            System.out.println("The given number is not palindrome");
        }
    }
}
