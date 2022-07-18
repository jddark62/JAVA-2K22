/*
 * Write a program that takes user input describing a playing card 
 * in the following shorthand notation
 * A Ace
 * 2 ..... 10 card values
 * J Jack
 * Q Queen
 * K King
 * D Diamonds
 * H Hearts
 * S Spades
 * C Clubs 
 * and displays the full name of the card.
 */
import java.util.Scanner;

/**
 * three
 */
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card");
        String card = sc.next();
        String cardName = "";
        if(str.charAt(0).equalsIgnoreCase('a'))
            name = "Ace";
        else if(str.charAt(0).equalsIgnoreCase('j'))
            name = "Jack";
        else if(str.charAt(0).equalsIgnoreCase('q'))
            name = "Queen";
        else if(str.charAt(0).equalsIgnoreCase('k'))
            name = "King";
        else if(str.charAt(0).equalsIgnoreCase('d'))
            name = "Diamonds";
        else if(str.charAt(0).equalsIgnoreCase('h'))
            name = "Hearts";
        else if(str.charAt(0).equalsIgnoreCase('s'))
            name = "Spades";
        else if(str.charAt(0).equalsIgnoreCase('c'))
            name = "Clubs";
        else
            name = "Invalid card";

    }

}