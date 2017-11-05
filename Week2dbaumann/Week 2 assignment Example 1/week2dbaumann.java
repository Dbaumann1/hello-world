/*
 * Program: Week 2 Example 1 Assignment
 * File: week2dbaumann.java
 * Author: Donovan Baumann
 * Date: 10/25/2017
 */
package week2dbaumann;

import java.io.PrintStream;
import java.util.Scanner;


public class week2dbaumann {
    private static Scanner sc;
    
    public static void main(String[] args) {
            int Number, Reminder, Sum = 0;
            sc = new Scanner(System.in);
            System.out.println("Please enter a five digit Positive Integer:");
            Number = sc.nextInt();
            
            while(Number > 0) {
                Reminder = Number % 10;
                Sum = Sum+ Reminder;
                Number = Number / 10;
    }
        PrintStream format;
        format = System.out.format("Sum of the digits of Given Number: - %d" , Sum);
    }

    
    }
