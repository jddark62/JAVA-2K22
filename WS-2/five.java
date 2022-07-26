/*
 * Design a class LongStringLength with  a static method columnMax 
 * that takes a 2-D array of Strings and returns a one-dimensional array 
 * of integers. In the returned array, the value at index i is the length 
 * of the maximum length string in column i. 
 * For example, consider this array:
 * String[][] a =     {{‘‘help’’, ‘‘ok’’, ‘‘city lights’’},
 * {‘‘elvisLives’’, ‘‘hello’’, ‘‘punch-out’’},
 * {‘‘hurrah’’, ‘‘humptydumpty’’, ‘‘123’’}};
 * Then the call columnMax(a) should return [10, 12, 11]
 */
import java.util.Scanner;
 class LongStringLength{
        public static int[] columnMax(String[][] a){
            int[] result = new int[a[0].length];
            for(int i = 0; i < a[0].length; i++){
                int max = 0;
                for(int j = 0; j < a.length; j++){
                    if(a[j][i].length() > max){
                        max = a[j][i].length();
                    }
                }
                result[i] = max;
            }
            return result;
        }
 }

 /**
  * five
  */
 public class five {
 
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int numRows = scan.nextInt();
            System.out.println("Enter the number of columns: ");
            int numCols = scan.nextInt();
            String[][] a = new String[numRows][numCols];
            for(int i = 0; i < numRows; i++){
                for(int j = 0; j < numCols; j++){
                    System.out.println("Enter the string: ");
                    a[i][j] = scan.next();
                }
            }
            int[] result = LongStringLength.columnMax(a);
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
    }
 }
 