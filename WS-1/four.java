/*
 * Write a program that asks the user to input
_ The number of gallons of gas in the tank
_ The fuel efficiency in miles per gallon
_ The price of gas per gallon
Then print out how far the car can go with the gas in the tank and print the cost per 100 miles

 */
import java.util.Scanner;

/**
 * four
 */
public class four {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of gallons of gas in the tank");
        double gallons = input.nextDouble();
        System.out.println("Enter the fuel efficiency in miles per gallon");
        double mpg = input.nextDouble();
        System.out.println("Enter the price of gas per gallon");
        double price = input.nextDouble();
        double distance = gallons * mpg;
        double cost = distance * price;
        System.out.println("The car can go " + distance + " miles");
        System.out.println("The cost per 100 miles is " + cost / 100);
    }
}