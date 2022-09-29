/*
 * The Java program should allow the user to compute sums of integers given in input. 
 * The program repeatedly asks the user if he/she wants to calculate a sum; if the answer is yes,
 *  then the program takes in input a sequence of integers terminated by a 0, 
 * then prints its sum, and asks the same question again. 
 * If the answer is no, then the program terminates.
The program as it is written, however, will not even pass compilation, 
because of uncaught (checked) exceptions.  
The program should include the suitable try-catch statement(s) 
so to cope with the following exceptions: 
NumberFormatException: an exception of this kind means that the datum read does not represent an integer. If this occurs, the user should be asked to reenter the datum and continue. 
InputMismatchException:. Also in this case, the user should be asked to reenter the datum and continue. 

 */

import java.util.Scanner;

public class one{
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
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}