package com.company;

import java.util.Scanner;
                 public class Main {

                     public static void main(String[] args) {
                         int temp = 0;  //intializing temp so while statement is true
                         int temperature = 98; //my random number
                         Scanner scanner = new Scanner(System.in); //scanner is used to take information(input)

                         while (temperature != temp) { // will only execute until the user get correct number

                             System.out.println("Input a number between 97.5 to 99.5: "); //Learning if statements.

                             temperature = scanner.nextInt(); //gets input from user

                             int value = Math.abs(temp - temperature); //determines the absolute value with math help
                             // now for the if statements

                             if (temperature < 97.5) {
                                 System.out.println("Low");
                             } else if (temperature >= 97.5 && temperature <= 99.5) {
                                 System.out.println("Normal");
                             } else if (temperature > 99.5) {
                                 System.out.println("High");
                             } else {
                             }
                         }
                     }
                 }


