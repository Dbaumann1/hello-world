/*
 * Program: Week 2 Example 2 Assignment
 * File: celsiustofarenheit.java
 * Author: Donovan Baumann
 * Date: 10/25/2017
 */
package Converter;

import java.util.Scanner;

public class celsiustofarenheit {

    public static void main(String[] args) {
        
        print(" === Farenheit to Celsius Conversion ===\n");
        convertTemperature();
    }

    private static void convertTemperature() {
        
        Scanner input = new Scanner(System.in);
        print("\nEnter 1 for Fahrenheit to Celsius"
                + "\nEnter 2 for Celsius to Fahrenheit"
                + "\nType any other value to Exit." + "\nYour Option:");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                print("Enter a degree in Fahrenheit:");
                far2cel();
                break;
            case 2:
                print("Enter a degree in Celsius:");
                cel2far();
                break;
            
        }
    }

    private static void cel2far() {
       
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        print(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32)
                + " Fahrenheit");
        convertTemperature();
    }

    private static void far2cel() {
        
        Scanner input = new Scanner(System.in);

        Double Fahrenheit = input.nextDouble();
        print(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0))
                + " celsius");
        convertTemperature();
    }

    private static void print(String string) {
        
        System.out.print("\n" + string);
    }
}
