/*
 * Write a program named PrimeRange (in PrimeRange.java) 
 * that asks the user for two numbers and prints out all 
 * the prime numbers between those two inputs, inclusive. 
 * (Here, inclusive means that if either number that the user enters 
 * is itself prime, then it should be included in the output.) 
 * You must use a method private static boolean checkPrime(int n) 
 * to do the primality checking.
 */
import java.util.Scanner;

/**
 * eleven
 */

public class eleven {

    // checkPrime method
    private static boolean checkPrime(int n){
        if(n < 2)
        return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = input.nextInt();
        System.out.println("Enter the second number");
        int second = input.nextInt();
        System.out.println("The prime numbers between " + first + " and " + second + " are:");
        for(int i = first; i <= second; i++) {
            if(checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}