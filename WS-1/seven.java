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
import java.util.Dictionary;
import java.util.Scanner;

/**
 * seven
 */
public class seven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        Dictionary<Integer, Integer> months = new Dictionary<Integer, Integer>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 30);
        months.put(9, 31);
        months.put(10, 30);
        months.put(11, 31);
        months.put(12, 30);
        if (year % 4 == 0) {
            months.put(2, 29);
        }
        if (month > 12 || month < 1) {
            System.out.println("Invalid month");
        } else if (day > months.get(month) || day < 1) {
            System.out.println("Invalid day");
        } else if (year < 0) {
            System.out.println("Invalid year");
        } else {
            System.out.println("Valid date");
        }
    }
}