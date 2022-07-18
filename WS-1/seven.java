/*
 * Write a java program that reads a date from the user in numeric form.  
 * For example, February 17, 2003 would be entered as the three integers 
 * 2, 17, and 2003.  
 * Your program must then determine if the date is a valid date.  
 * Use the following information to determine 
 * if the date is valid:  January, March, May, July, 
 * August, October, and December all have 31 days.  
 * April, June, September, and November all have 30 days.  
 * February has 28 days in a non-leap year and 29 days in a leap year.  
 * Echo the input and print either valid date or invalid date as output.
 */
import java.util.Scanner;

/**
 * seven
 */
public class seven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = input.nextInt();
        System.out.println("Enter the day");
        int day = input.nextInt();
        System.out.println("Enter the year");
        int year = input.nextInt();
        
    }
}