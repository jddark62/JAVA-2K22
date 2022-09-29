/*
 * Define a class that would be capable of representing simple linked lists
 * , where each list-node contains a string. 
 * You should show how to traverse such lists, 
 * build them and how to reverse a list. 
 * In the case of the list reversing code please provide two versions,
 *  one of which creates the reversed list by changing pointers
 *  in the input list, and another which leaves the original list 
 * undamaged and allocates fresh space for the reversed version .

 */

import java.util.*;

class MyLinkedList <T> {
    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void reverse() {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public MyLinkedList<T> reverse2() {
        MyLinkedList<T> list = new MyLinkedList<T>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }
    public int size() {
        return size;
    }
}

public class linked_list {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.traverse();
        System.out.println("Reversing...");
        list.reverse();
        list.traverse();
        System.out.println("Reversing again...");
        MyLinkedList<String> list2 = list.reverse2();
        list2.traverse();
    }
}