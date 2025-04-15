import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the pick up day?");
        String pickUpDay = myScanner.nextLine();

        System.out.println("How many days are you renting the car for?");
        int daysRented = myScanner.nextInt();

        myScanner.nextLine();

        System.out.println("Do you want add a electronic toll tag?");
        String eToll = myScanner.nextLine();

        System.out.println("Do you want a GPS?");
        String gps = myScanner.nextLine();

        System.out.println("Do you want roadside assistance?");
        String roadSideAssistance = myScanner.nextLine();

        System.out.println("How old are you?");
        int age = myScanner.nextInt();

        double basePrice = 29.99 * daysRented;
        double options = 0;

        if (eToll.equalsIgnoreCase("yes")) {
            options += 3.95;
        }
        if (gps.equalsIgnoreCase("yes")) {
            options += 2.95;
        }
        if (roadSideAssistance.equalsIgnoreCase("yes")) {
            options += 3.95;
        }
        options *= daysRented;
        double underAge = 0;
        double subtotal = basePrice + options;
        if (age < 25) {
            underAge = subtotal * 0.3;
        }
        double total = subtotal + underAge;
        System.out.printf("The base price is $%.2f%n" , basePrice);
        System.out.printf("The options are $%.2f%n" , options);
        System.out.printf("The underage driver surcharge is $%.2f%n" , underAge);
        System.out.printf("The total is $%.2f%n" , total);


    }
}