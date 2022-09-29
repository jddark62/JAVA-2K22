/*
 The process of finding the Euler number can be parallelized by computing even and odd terms in the series separately in parallel,i.e:
e=1+eodd+eeven
eodd=11!++13!+15!+⋯+1(2n+1)!+⋯
eeven=12!++14!+16!+⋯+1(2n)!+⋯
Write a program which computes truncated versions of the two parts in parallel.

 */
import java.util.concurrent.*;
import java.util.*;
import java.math.*;
public class EulerNumber {
    public static void main(String[] args) {
        int n = 100000;
        long startTime = System.currentTimeMillis();
        double e = 1;
        double eodd = 0;
        double even = 0;
        double odd = 0;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Double> future1 = executor.submit(new Odd(n));
        Future<Double> future2 = executor.submit(new Even(n));
        try {
            eodd = future1.get();
            even = future2.get();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } catch (ExecutionException e1) {
            e1.printStackTrace();
        }
        e = e + eodd + even;
        long endTime = System.currentTimeMillis();
        System.out.println("The Euler number is " + e);
        System.out.println("The time taken is " + (endTime - startTime) + "ms");
    }
}
class Odd implements Callable<Double> {
    int n;
    public Odd(int n) {
        this.n = n;
    }
    public Double call() {
        double odd = 0;
        for (int i = 1; i <= n; i++) {
            odd = odd + 1.0 / factorial(2 * i - 1);
        }
        return odd;
    }
    public double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
class Even implements Callable<Double> {
    int n;
    public Even(int n) {
        this.n = n;
    }
    public Double call() {
        double even = 0;
        for (int i = 1; i <= n; i++) {
            even = even + 1.0 / factorial(2 * i);
        }
        return even;
    }
    public double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

