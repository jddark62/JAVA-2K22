/*
 *  Standard telephone keypads contain the digits zero through nine. The numbers two through nine each have three letters associated with them (Fig. 17.25). Many people find it difficult to memorize phone numbers, so they use the correspondence between digits and letters to develop seven-letter words that correspond to their phone numbers. For example, a person whose telephone number is 686-2377 might use the correspondence indicated in Fig. 17.25 to develop the seven-letter word “NUMBERS.” Every seven-letter word corresponds to exactly one seven-digit telephone number. A restaurant wishing to increase its takeout business could surely do so with the number 825-3688 (i.e., “TAKEOUT”).
Every seven-letter phone number corresponds to many different seven-letter words, but most of these words represent unrecognizable juxtapositions of letters. It’s possible, however, that the owner of a barbershop would be pleased to know that the shop’s telephone number, 424-7288, corresponds to “HAIRCUT.” A veterinarian with the phone number 738-2273 would be pleased to know that the number corresponds to the letters “PETCARE.” An automotive dealership would be pleased to know that the dealership number, 639-2277, corresponds to “NEWCARS.” 
Write a program that, given a seven-digit number, uses a PrintStream object to write to a file every possible seven-letter word combination corresponding to that number. There are 2,187 (37) such combinations. Avoid phone numbers with the digits 0 and 1.
 */

import java.io.*;
import java.util.*;

public class telephone {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a seven-digit number: ");
        String number = input.nextLine();
        String[] letters = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] words = new String[7];
        for (int i = 0; i < 7; i++) {
            words[i] = letters[Integer.parseInt(number.substring(i, i + 1))];
        }
        PrintWriter output = new PrintWriter("telephone.txt");
        for (int i = 0; i < words[0].length(); i++) {
            for (int j = 0; j < words[1].length(); j++) {
                for (int k = 0; k < words[2].length(); k++) {
                    for (int l = 0; l < words[3].length(); l++) {
                        for (int m = 0; m < words[4].length(); m++) {
                            for (int n = 0; n < words[5].length(); n++) {
                                for (int o = 0; o < words[6].length(); o++) {
                                    output.println(words[0].substring(i, i + 1) + words[1].substring(j, j + 1) + words[2].substring(k, k + 1) + words[3].substring(l, l + 1) + words[4].substring(m, m + 1) + words[5].substring(n, n + 1) + words[6].substring(o, o + 1));
                                }
                            }
                        }
                    }
                }
            }
        }
        output.close();
    }
}


