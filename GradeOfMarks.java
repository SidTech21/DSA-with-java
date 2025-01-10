package com.siddharth;

import java.util.Scanner;
//ques: Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

public class GradeOfMarks {
    public static void main(String[] args) {
        System.out.print("Enter the marks you get: ");
        Scanner input  = new Scanner(System.in);
        int marks = input.nextInt();

        Marks(marks);


    }
    static void Marks(int marks){
        if(marks > 100){
            System.out.println("Marks is under 100 ");
        }
        if( marks >= 91 ){
            System.out.println("AA");
        }else if(marks >= 81){
            System.out.println("AB");
        }else if(marks >=71 ){
            System.out.println("BB");
        }else if(marks >= 61){
            System.out.println("BC");
        }else if(marks >= 51){
            System.out.println("CD");
        }else if(marks >= 41){
            System.out.println("DD");
        }else if(marks <40){
            System.out.println("Fail");
        }else{
            System.out.println("Please enter valid numbers");
        }
    }
}
