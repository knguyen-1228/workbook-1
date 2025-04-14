package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.print("Enter your pay rate: ");
        double payRate = myScanner.nextDouble();

        System.out.println(name + " $" + (hoursWorked * payRate));
    }
}
