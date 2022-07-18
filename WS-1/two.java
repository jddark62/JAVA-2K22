/*
 * Write a program that translates a letter grade into a number grade. 
 * Letter grades are A B C D F, possibly followed by + or -. 
 * Their numeric values are 4, 3, 2, 1, and 0. 
 * There is no F+ or F-. A + increases the numeric value by 0.3, 
 * a - decreases it by 0.3. However, an A+ has value 4.0.

 */
import java.util.Scanner;

/**
 * two
 */
public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter grade");
        String letterGrade = input.next();
        double numericGrade = 0;
        if(letterGrade.equals("A")) {
            numericGrade = 4.0;
        }
        else if(letterGrade.equals("B")) {
            numericGrade = 3.0;
        }
        else if(letterGrade.equals("C")) {
            numericGrade = 2.0;
        }
        else if(letterGrade.equals("D")) {
            numericGrade = 1.0;
        }
        else if(letterGrade.equals("A+")) {
            numericGrade = 4.3;
        }
        else if(letterGrade.equals("A-")) {
            numericGrade = 3.7;
        }
        else if(letterGrade.equals("B+")) {
            numericGrade = 3.3;
        }
        else if(letterGrade.equals("B-")) {
            numericGrade = 2.7;
        }
        else if(letterGrade.equals("C+")) {
            numericGrade = 2.3;
        }
        else if(letterGrade.equals("C-")) {
            numericGrade = 1.7;
        }
        else if(letterGrade.equals("D+")) {
            numericGrade = 1.3;
        }
        else if(letterGrade.equals("D-")) {
            numericGrade = 0.7;
        }
        else{
            System.out.println("Invalid grade");
        }
        System.out.println("The numeric grade is " + numericGrade);
    }  
}
