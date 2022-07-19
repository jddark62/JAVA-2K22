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
import java.util.HashMap;
import java.util.Scanner;

/**
 * three
 */
public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> cardMap = new HashMap<String, String>();
        cardMap.put("A", "Ace");
        cardMap.put("2", "Two");
        cardMap.put("3", "Three");
        cardMap.put("4", "Four");
        cardMap.put("5", "Five");
        cardMap.put("6", "Six");
        cardMap.put("7", "Seven");
        cardMap.put("8", "Eight");
        cardMap.put("9", "Nine");
        cardMap.put("10", "Ten");
        cardMap.put("J", "Jack");
        cardMap.put("Q", "Queen");
        cardMap.put("K", "King");
        cardMap.put("D", "Diamonds");
        cardMap.put("H", "Hearts");
        cardMap.put("S", "Spades");
        cardMap.put("C", "Clubs");
        String card = input.nextLine();
        String[] cardSplit = card.split(" ");
        String cardValue = cardSplit[0];
        String cardSuit = cardSplit[1];
        System.out.println(cardMap.get(cardValue) + " of " + cardMap.get(cardSuit));
    }

}