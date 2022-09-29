/*
 * Find the integer in the range 1 to 10000 that has the largest number 
 * of divisors. Now write a program that uses multiple threads 
 * to solve the same problem, but for the range 1 to 100000 
 * (or less, if you don't have a fast computer).
 *  By using threads, your program will take 
 * less time to do the computation when it is run on a multiprocessor 
 * computer. At the end of the program, 
 * output the elapsed time, the integer 
 * that has the largest number of divisors, 
 * and the number of divisors that it has.
 *  For this exercise, you should simply divide up the problem into parts
 *  and create one thread to do each part.

 */

import java.util.ArrayList;
import java.util.List;

public class one {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<Thread>();
        List<DivisorThread> divisorThreads = new ArrayList<DivisorThread>();

        // create 10 threads and run them
        for (int i = 1; i <= 10; i++) {
            DivisorThread divisorThread = new DivisorThread(i);
            Thread thread = new Thread(divisorThread);
            threads.add(thread);
            divisorThreads.add(divisorThread);
            thread.start();
        }

        // wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // find the thread with the largest number of divisors
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < divisorThreads.size(); i++) {
            int currentMax = divisorThreads.get(i).getMax();
            if (currentMax > max) {
                max = currentMax;
                maxIndex = i;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("The integer with the largest number of divisors is: " + maxIndex);
        System.out.println("The number of divisors is: " + max);

    }

}

class DivisorThread implements Runnable {

    private int max = 0;
    private int maxIndex = 0;

    private int start;
    private int end;

    public DivisorThread(int index) {
        start = (index - 1) * 1000 + 1;
        end = index * 1000;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            int currentMax = findDivisors(i);
            if (currentMax > max) {
                max = currentMax;
                maxIndex = i;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    private int findDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    
}