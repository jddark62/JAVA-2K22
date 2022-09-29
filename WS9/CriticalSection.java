/*
 * A very simple example of a critical section that is protected by a 
 *  binary semaphore lock. There is a global variable numTickets
 *  which tracks the  number of tickets remaining to sell. 
 * We will create many threads that all  will attempt to sell tickets 
 * until they are all gone.
 *  However, we must  control access to this global variable lest we sell 
 * more tickets than  really exist. 
 * We have a semaphore lock that will only allow one seller  thread 
 * to access the numTickets variable at a time. 
 * Before attempting to sell a ticket, the thread must acquire the lock 
 * by waiting on the semaphore  
 * and then release the lock when through by signalling the semaphore.

 */

import java.util.concurrent.Semaphore;

public class CriticalSection {
    static int numTickets = 100;
    static Semaphore lock = new Semaphore(1);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Seller()).start();
        }
    }

    static class Seller implements Runnable {
        public void run() {
            while (true) {
                try {
                    lock.acquire();
                    if (numTickets > 0) {
                        System.out.println(Thread.currentThread().getName() + " sold a ticket");
                        numTickets--;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " is out of tickets");
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.release();
                }
            }
        }
    }
}
