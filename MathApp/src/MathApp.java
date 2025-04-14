public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 100000;
        double GarySalary = 120000;
        // prints highest value
        System.out.println("The Highest salary is " + Math.max(bobSalary, GarySalary));
        System.out.println("-------------------------------------");

        double carPrice = 100000;
        double truckPrice = 120000;
        //prints lowest value
        System.out.println("The cheapest price is " + Math.min(carPrice, truckPrice));
        System.out.println("-------------------------------------");

        double radius = 7.5;
        //made variable to get the area of a circle
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with a radius of " + radius + " is " + area);
        System.out.println("-------------------------------------");

        double number = 5.0;
        //calculating the square root
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
        System.out.println("-------------------------------------");

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        // calculate the distance formula that I googled
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
        System.out.println("-------------------------------------");

        double x = -3.8;
        //taking the absolute value of x
        double absValue = Math.abs(x);
        System.out.println("The absolute value of " + x + " is " + absValue);
        System.out.println("-------------------------------------");

        //getting a random number between 0 and 1
        System.out.println("The random number between 0 and 1 is " + Math.random());


    }
}