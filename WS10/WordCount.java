/*
 *  Write a program WordCount that counts the words in one or more files. Start a new thread for each file. For example, if you call java WordCount report.txt address.txt Homework.java then the program might print 
address.txt: 1052
Homework.java: 445
report.txt: 2099

 */
import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = input.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File " + fileName + " does not exist");
            System.exit(0);
        }
        Scanner fileInput = new Scanner(file);
        int count = 0;
        while (fileInput.hasNext()) {
            fileInput.next();
            count++;
        }
        System.out.println(fileName + ": " + count);
    }
}

