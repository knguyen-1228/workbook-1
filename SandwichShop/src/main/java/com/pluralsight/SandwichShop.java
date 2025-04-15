package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Did you want a (1) Regular or (2) Large?");
        int sandwichSize = size.nextInt();
        double sandwichCost;
        if(sandwichSize == 1) {
            System.out.println("Regular Sandwich costs $5.45");
            sandwichCost = 5.45;
        } else {
            System.out.println("Large Sandwich costs $8.95");
            sandwichCost = 8.95;
        }
        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int ageOfCustomer = age.nextInt();
        double totalCost;
        if(ageOfCustomer <= 17) {
            System.out.println("You are under 18. You get a 10% discount on your sandwich.");
            totalCost = sandwichCost - (sandwichCost * .1);
        } else if (ageOfCustomer > 17 && ageOfCustomer < 64) {
            System.out.println("You are between 18 and 64. You get a no discount on your sandwich.");
            totalCost = sandwichCost;
        } else {
            System.out.println("You are over 65. You get a 20% discount on your sandwich.");
            totalCost = sandwichCost - (sandwichCost * .2);
        }
        System.out.println("Your total cost is $" + totalCost);

    }
}
