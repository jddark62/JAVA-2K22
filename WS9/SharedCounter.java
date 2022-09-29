/*
 * Write a program called SharedCounter.java in which 10 threads 
 * each increment a shared int counter 10 times.
 *  When all the threads have finished, 
 * print the final value of the counter. 
 * If the initial value is zero, do you always get 100? 
 * Arrange for your code to  print the wrong answer. 
 * (Hint: try using some well-placed calls  to  Thread.yield() 
 * or Thread.sleep().)
 */

import java.util.ArrayList;
import java.util.List;

public class SharedCounter{
    private int counter = 0;

    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        long startTime = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<Thread>();
        List<CounterThread> counterThreads = new ArrayList<CounterThread>();

        // create 10 threads and run them
        for (int i = 0; i < 10; i++) {
            CounterThread counterThread = new CounterThread(sharedCounter);
            Thread thread = new Thread(counterThread);
            threads.add(thread);
            counterThreads.add(counterThread);
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

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("The final value of the counter is: " + sharedCounter.getCounter());

    }

    public synchronized int getCounter() {
        return counter;
    }

    public synchronized void incrementCounter() {
        counter++;
    }
}

class CounterThread implements Runnable {

    private SharedCounter sharedCounter;

    public CounterThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedCounter.incrementCounter();
        }
    }
}

