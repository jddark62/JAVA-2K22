/*
 * Write a program that gives you a fortune based on an astrological sign. 
 * Use a switch statement to structure the code.
 */
import java.util.Scanner;

/**
 * five
 */
public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your astrological sign: ");
        String sign = input.nextLine();
        switch (sign) {
            case "Aries":
                System.out.println("You will be successful in your work.");
                break;
            case "Taurus":
                System.out.println("You will be successful in your work.");
                break;
            case "Gemini":
                System.out.println("You will be successful in your work.");
                break;
            case "Cancer":
                System.out.println("You will be successful in your work.");
                break;
            case "Leo":
                System.out.println("You will be successful in your work.");
                break;
            case "Virgo":
                System.out.println("You will be successful in your work.");
                break;
            case "Libra":
                System.out.println("You will be successful in your work.");
                break;
            case "Scorpio":
                System.out.println("You will be successful in your work.");
                break;
            case "Sagittarius":
                System.out.println("You will be successful in your work.");
                break;
            case "Capricorn":
                System.out.println("You will be successful in your work.");
                break;
            case "Aquarius":
                System.out.println("You will be successful in your work.");
                break;
            case "Pisces":
                System.out.println("You will be successful in your work.");
                break;
            default:
                System.out.println("You will be successful in your work.");
                break;
        }
    }
}