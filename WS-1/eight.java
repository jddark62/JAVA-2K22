/*
 * Write an application that displays the integer equivalents 
 * of some uppercase letters, lowercase letters, digits and special symbols.
 * At a minimum, display the integer equivalents of the following: 
 * A B C a b c 0 1 2 $ * + / and the blank character
 */
import java.util.Scanner;

/**
 * eight
 */
public class eight {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        String character = input.next();
        int asciiValue = character.charAt(0);
        System.out.println("The ASCII value of " + character + " is " + asciiValue);
    }
}