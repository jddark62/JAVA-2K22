/*
 * Write a program called MaxValue.java that finds the maximum value 
 * in an array of integers using 4 threads. 
 * You should construct an array of random numbers instead of 
 * increasing numbers. 
 * The array in  your threaded code should have at least 4 elements.

 */

import java.util.ArrayList;
import java.util.List;

public class MaxValue {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }

        List<Thread> threads = new ArrayList<Thread>();
        List<MaxValueThread> maxValueThreads = new ArrayList<MaxValueThread>();

        // create 4 threads and run them
        for (int i = 0; i < 4; i++) {
            MaxValueThread maxValueThread = new MaxValueThread(array, i);
            Thread thread = new Thread(maxValueThread);
            threads.add(thread);
            maxValueThreads.add(maxValueThread);
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

        // find the thread with the largest number
        int max = 0;
        for (MaxValueThread maxValueThread : maxValueThreads) {
            int currentMax = maxValueThread.getMax();
            if (currentMax > max) {
                max = currentMax;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("The largest number is: " + max);

    }

}

class MaxValueThread implements Runnable {

    private int max = 0;

    private int[] array;
    private int index;

    public MaxValueThread(int[] array, int index) {
        this.array = array;
        this.index = index;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        for (int i = index; i < array.length; i += 4) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

}