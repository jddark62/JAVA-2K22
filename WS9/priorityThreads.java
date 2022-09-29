/*
 * Write a Java program to create four threads with different priorities. Send two threads of the highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting
 */

import java.util.concurrent.*;

public class priorityThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Thread3());
        Thread t4 = new Thread(new Thread4());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.start();
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
    }
}

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread4 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 4: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
