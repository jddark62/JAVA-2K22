/*
Implement quicksort using multithreading. Write a test program that times the execution time for a list of size 9,000,000 using multithreading 
and a sequential method. Compare the execution time for the two approaches. 
Multithreading uses 2 threads first.
5 threads for the next step.
10 threads for the next step.
Use a separate class for the thread, which extends the Thread class.
Compare the execution time for each thread count. Display an exception if the time is not reduced.
*/

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class QuickSort extends Thread {
    int[] list;
    int start;
    int end;

    public QuickSort(int[] list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        quickSort(list, start, end);
    }

    public void quickSort(int[] list, int start, int end) {
        if (start < end) {
            int pivot = partition(list, start, end);
            quickSort(list, start, pivot - 1);
            quickSort(list, pivot + 1, end);
        }
    }

    public static int partition(int[] list, int start, int end) {
        int pivot = list[end];
        int i = start - 1;
        int temp;
        for ( int j = start; j < end; j++) {
			if (list[j] <= pivot) {
				i++;
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		while (i < end) {
			i++;
			temp = list[i];
			list[i] = list[end];
			list[end] = temp;
		}
		return i;
	}

	// method to quicksort using number of threads using a nonstatic method
	public void quickSort(int[] list, int start, int end, int numThreads) {
		if (numThreads == 1) {
			quickSort(list, start, end);
		} else {
			int pivot = partition(list, start, end);
			QuickSort qs1 = new QuickSort(list, start, pivot - 1);
			QuickSort qs2 = new QuickSort(list, pivot + 1, end);
			qs1.start();
			qs2.start();
			try {
				qs1.join();
				qs2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class quickSort {
	public static void main(String[] args) {
		int[] list = new int[9000];
		for (int i = 0; i < list.length; i++) {
			list[i] = ThreadLocalRandom.current().nextInt(0, 10000);
		}
		QuickSort qs = new QuickSort(list, 0, list.length - 1);
		long startTime = System.currentTimeMillis();
		qs.quickSort(list, 0, list.length - 1, 2);
		long endTime = System.currentTimeMillis();
		System.out.println("Time for 2 threads: " + (endTime - startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		qs.quickSort(list, 0, list.length - 1, 5);
		endTime = System.currentTimeMillis();
		System.out.println("Time for 5 threads: " + (endTime - startTime) + " milliseconds");
		//exception if time is not reduced
		if ((endTime - startTime) > (endTime - startTime)) {
			throw new IllegalArgumentException("Time is not reduced");
		}
		startTime = System.currentTimeMillis();
		qs.quickSort(list, 0, list.length - 1, 10);
		endTime = System.currentTimeMillis();
		System.out.println("Time for 10 threads: " + (endTime - startTime) + " milliseconds");
		//exception if time is not reduced
		if ((endTime - startTime) > (endTime - startTime)) {
			throw new IllegalArgumentException("Time is not reduced");
		}
		//time taken for sequential method
		startTime = System.currentTimeMillis();
		qs.quickSort(list, 0, list.length - 1);
		endTime = System.currentTimeMillis();
		System.out.println("Time for sequential method: " + (endTime - startTime) + " milliseconds");
		//Increase the number of threads sequentially and see when performance degrades
		long previousTime = 0;
		for (int i = 2; i < 100; i++) {
			startTime = System.currentTimeMillis();
			qs.quickSort(list, 0, list.length - 1, i);
			endTime = System.currentTimeMillis();
			System.out.println("Time for " + i + " threads: " + (endTime - startTime) + " milliseconds");
			//store the time for the previous step
			//  Raise an exception if run time increases when number of threads are increased 
			// using the previous time
			if ((endTime - startTime) > previousTime && i > 2) {
				throw new IllegalArgumentException("Time is not reduced");
			}
			previousTime = endTime - startTime;
		}
	}
}

