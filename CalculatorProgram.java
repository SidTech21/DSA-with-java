package com.siddharth;
//Important: calculate basics operation until the user enters the x or X
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println();
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter the number1: ");
                int num1 = input.nextInt();

                System.out.print("Enter the number2: ");
                int num2 = input.nextInt();

                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }


            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid character");
            }

            System.out.println("Calculated result is : " + ans);
        }




    }
}
