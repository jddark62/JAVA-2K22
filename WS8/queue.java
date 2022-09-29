/*
 *  A priority queue maintains a list of pairs, each consisting of 
 * a priority (an integer) and a name (a String), 
 * sorted into increasing order of priority.
 *  Three operations are required — one that just creates an empty queue,
 *  and then one called insert that takes an integer and
 *  a string as its arguments and places them in the correct position
 *  in the list. Finally a method next takes no arguments.
 *  It removes the first pair from the list and returns its text string. 
 * It should throw an exception if the queue is empty when it is called.
 *  Give the definition of a Java class that implements the queue object. 

 */

import java.util.*;

class MyPriorityQueue <T> {
    private class Node {
        int priority;
        T data;
        Node next;
        Node(int priority, T data) {
            this.priority = priority;
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyPriorityQueue() {
        head = null;
        tail = null;
        size = 0;
    }
    public void insert(int priority, T data) {
        Node node = new Node(priority, data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node current = head;
            Node previous = null;
            while (current != null && current.priority < priority) {
                previous = current;
                current = current.next;
            }
            if (previous == null) {
                node.next = head;
                head = node;
            } else {
                previous.next = node;
                node.next = current;
            }
            if (current == null) {
                tail = node;
            }
        }
        size++;
    }
    public T next() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.priority + " " + current.data);
            current = current.next;
        }
    }
}

public class queue {
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<String>();
        queue.insert(1, "A");
        queue.insert(2, "B");
        queue.insert(3, "C");
        queue.insert(4, "D");
        queue.insert(5, "E");
        queue.insert(6, "F");
        queue.insert(7, "G");
        queue.insert(8, "H");
        queue.insert(9, "I");
        queue.insert(10, "J");
        queue.print();
        System.out.println("After removing 5 elements");
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.next());
        }
        System.out.println("After removing 5 more elements");
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.next());
        }
        System.out.println("Exception check");
        try {
            queue.next();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught");
        }
    }
}

