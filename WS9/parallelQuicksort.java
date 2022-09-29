/*
 * Implement the following method in parallel to sort a list 
 * using quick sort (public static void parallelQuickSort(int[] list). 
 * Write a test program that times the execution time 
 * for a list of size 9,000,000 
 * using this parallel method and a sequential method.
 */

import java.util.random.*;
import java.util.concurrent.*;

public class parallelQuicksort {
    public static void main(String[] args) {
        int[] list = new int[9000000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 1000000);
        }
        long startTime = System.currentTimeMillis();
        parallelQuickSort(list);
        long endTime = System.currentTimeMillis();
        System.out.println("The parallel quick sort took " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        quickSort(list);
        endTime = System.currentTimeMillis();
        System.out.println("The sequential quick sort took " + (endTime - startTime) + " milliseconds");
    }

    public static void parallelQuickSort(int[] list) {
        RecursiveAction mainTask = new SortTask(list);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(mainTask);
    }

    

    