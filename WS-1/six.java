/*
 *  Write a program that ask the user for the number to print as a 
 * unicode character. If the user enters a letter, 
 * tell the user they entered a letter instead of a number. 
 * Print the number as a  unicode character by casting it to a char. 
 * Divide the number by 3 three times. 
 * Then multiply that result back by 27. 
 * Print the result with only 2 decimal places using the 
 * DecimalFormatter class 
 * Compare the final result to the original number to see whether 
 * they are the exact same number exactly. 
 * Compare the final result to the original number to see whether they are within 
 * +/- .001 of each other.
 */
import java.util.Scanner;
/**
 * six
 */
public class six {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print as a unicode character");
        int number = input.nextInt();
        if(number >= 65 && number <= 90) {
            System.out.println("You entered a letter");
        }
        else if(number >= 97 && number <= 122) {
            System.out.println("You entered a letter");
        }
        else {
            System.out.println("The number is " + (char)number);
            for(int i = 0; i < 3; i++) {
                number = number / 3;
            }
            number = number * 27;
            System.out.println("The number is " + String.format("%.2f", number));
            if(number == (double)number) {
                System.out.println("The number is the same");
            }
            else if(Math.abs(number - (double)number) < 0.001) {
                System.out.println("The number is close enough");
            }
            else {
                System.out.println("The number is not the same");
            }
        }
        
    }
}