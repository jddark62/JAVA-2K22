/*
 * Write a Java program that enters an 8-digit string for a birth date . The first two digits in the string are the month of birth, the next two are the day and the remaining four are the year. The Java program should squeeze out these substrings and display it on the screen. You need to check if the month and day are out of range, and handle the exceptions of Integer.parseInt().
 >Suppose the string entered is: 07211979
Then prints:
month of birth: 07
day of birth: 21
year of birth: 1979
>Suppose the string entered is: 06311979
Then prints:
Month 06 only has only 30 days. Try again.
Hint. Use the String class and the method  -public String substring(int beginIndex,int endIndex)
 */

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the birth date:");
            String birthDate = input.nextLine();
            int month = Integer.parseInt(birthDate.substring(0, 2));
            int day = Integer.parseInt(birthDate.substring(2, 4));
            int year = Integer.parseInt(birthDate.substring(4, 8));
            System.out.println("month of birth: " + month);
            System.out.println("day of birth: " + day);
            System.out.println("year of birth: " + year);
        } catch (Exception e) {
            System.out.println("Invalid birth date.");
        }
    }
}