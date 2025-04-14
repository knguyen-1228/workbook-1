package com.pluralsight;

//import the scanner from java.util
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        // create an instance of the scanner
        Scanner myScanner = new Scanner(System.in);
        // ask the user for first number
        System.out.print("Enter Number 1: ");
        // stop application and wait for user to give answer
        int num1 = myScanner.nextInt();
        // ask the user for second number
        System.out.print("Enter Number 2: ");
        // stop application and wait for answer
        int num2 = myScanner.nextInt();
        // Eats up the extra LF (the press enter) from scanner above
        myScanner.nextLine();
        // Display manu for type of calculation
        System.out.println("Possible Calculations: ");
        System.out.println("    (A)dd ");
        System.out.println("    (S)ubtract ");
        System.out.println("    (M)ultiply ");
        System.out.println("    (D)ivide ");
        System.out.print("Please select a calculation: ");
        String calc = myScanner.nextLine();


        System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }
}
