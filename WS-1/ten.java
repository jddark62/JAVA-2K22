/*
 * Write a program that stores 16 float items  in 5 by 4 matrix,
 *  the last row of the matrix should contain the sums of the columns ,
 * calculated by your program. Then the whole matrix is printed. 
 */
import java.util.Scanner;
/**
 * ten
 */
public class ten {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] matrix = new float[5][4];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("Enter a number");
                matrix[i][j] = input.nextFloat();
            }
    }
    float sum = 0;
    for(int i = 0; i < 4; i++) 
    {
        for(int j = 0; j < 5; j++) 
        {
            sum += matrix[j][i];
        }
            matrix[4][i] = sum;
            sum = 0;
        }
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
    }

}
}