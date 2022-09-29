/*
 * Implement the following method in parallel to sort a list using 
 * quick sort (public static void parallelQuickSort(int[] list). 
 * Write a test program that times the execution time for a list of size
 *  9,000,000 using this parallel method and a sequential method.

 */

import java.util.concurrent.*;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] list = new int[9000000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100000);
        }
        long startTime = System.currentTimeMillis();
        parallelQuickSort(list);
        long endTime = System.currentTimeMillis();
        System.out.println("The time taken is " + (endTime - startTime) + "ms");
    }
    public static void parallelQuickSort(int[] list) {
        QuickSortTask task = new QuickSortTask(list);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
}

class QuickSortTask extends RecursiveAction {
    private final int THRESHOLD = 5000;
    private int[] list;
    public QuickSortTask(int[] list) {
        this.list = list;
    }
    @Override
    protected void compute() {
        if (list.length < THRESHOLD) {
            java.util.Arrays.sort(list);
        } else {
            int pivot = list[0];
            List<int[]> sublists = partition(list, pivot);
            invokeAll(new QuickSortTask(sublists.get(0)),
                    new QuickSortTask(sublists.get(1)));
        }
    }
    private List<int[]> partition(int[] list, int pivot) {
        List<int[]> sublists = new ArrayList<int[]>();
        int[] firstList = new int[list.length];
        int[] secondList = new int[list.length];
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] < pivot) {
                firstList[firstCount++] = list[i];
            } else {
                secondList[secondCount++] = list[i];
            }
        }
        int[] firstSublist = new int[firstCount];
        System.arraycopy(firstList, 0, firstSublist, 0, firstCount);
        sublists.add(firstSublist);
        int[] secondSublist = new int[secondCount];
        System.arraycopy(secondList, 0, secondSublist, 0, secondCount);
        sublists.add(secondSublist);
        return sublists;
    }
}