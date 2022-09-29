/*
 * Create a class Myexception and declare the integer a,b,c inside the class. Store length of the argument in a and get the variable for b. Calculate c=b/a. Print the value of a,b,c. Declare variable d[] = new int [a-2]. The program should give an output of the following form:
Sample input and output:
C:\>java exception8
Enter bvalue:1
java.lang.ArithmeticException:/by zero
C:\>java exception8 3
Enter b value: 4
a = 1
b = 4
b/a = 4
java.lang.NegativeArraySizeException
C:\>java exception8 3 5
Enter b value: 5
a = 2
b = 5
b/a =2
java.lang.ArrayIndexOutOfBoundsException: 42
C:\>java exception8 3 5
Enter b value: t
java.lang.NumberFormatException: for input string : “t”.

 */

import java.util.Scanner;

class Myexception {
    int a, b, c;
    int d[] = new int[a - 2];
    Myexception(int a, int b) {
        this.a = a;
        this.b = b;
        c = b / a;
    }
    void print() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

/**
 * exception8
 */
public class exception8 {

    
}