/*
Consider the following   diagram that represents a library system 
that records the books that have been borrowed. 
There are three kinds of books: regular books, reference books,
 and audio books. 
 Reference books can be taken out for just two days, 
 while other kinds of books may be borrowed for two weeks. 
 The overdue fees are Rs.1/- per day for reference books and regular books,
  and Rs.2/- per day for audio books.
Audio books and regular books have both authors and titles; 
reference books only have titles.
The day when the book is taken out and the day due are counted as days 
since the library opened on New Year’s Day in 2019.
+-------+
               | Book |
               +-------+
                   |
       |                  |            |
+---------------+  +---------------+  +---------------+
| Regular
  Book          |  | ReferenceBook       |  | AudioBook     |
+---------------+  +---------------+  +---------------+
| String title  |  | String title  |  | String title  |
| String author |  | int dayTaken  |  | String author |
| int dayTaken  |  +---------------+  | int dayTaken  |
+---------------+                     +---------------+
Design the classes that represent the library borrowing system.
Define the abstract class  Book and lift those fields that can be lifted to this class.
Design the method daysOverdue that consumes the number that represents today in the library date-recording system and produces the number of days this book is overdue. If the number is negative, the book can still be out for that many days.
Design the method isOverdue that produces a boolean value that informs us whether the book is overdue on the given day.
Design the method computeFine that computes the fine for this book, if the book is returned on the given day.
Implement the above specifications carefully with an  abstract class and  concrete classes.

 */

import java.util.Scanner;

abstract class Book{
    String title;
    String author;
    int dayTaken;
    int dayDue;
    int daysOverdue;
    int fine;
    boolean isOverdue;
    abstract int daysOverdue(int today);
    abstract boolean isOverdue(int today);
    abstract int computeFine(int today);

    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nDay Taken: " + dayTaken + "\nDay Due: " + dayDue + "\nDays Overdue: " + daysOverdue + "\nFine: " + fine;
    }

    
}

class RegularBook extends Book{
    RegularBook(String title, String author, int dayTaken, int dayDue){
        super(title, author, dayTaken, dayDue);
    }
    int daysOverdue(int today){
        return today - dayDue;
    }
    boolean isOverdue(int today){
        return today > dayDue;
    }
    int computeFine(int today){
        return daysOverdue(today) * 2;
    }
}

class RefBook extends Book{
    RefBook(String title, String author, int dayTaken, int dayDue){
        super(title, author, dayTaken, dayDue);
    }
    int daysOverdue(int today){
        return today - dayDue;
    }
    boolean isOverdue(int today){
        return today > dayDue;
    }
    int computeFine(int today){
        return daysOverdue(today) * 1;
    }
}

class AudioBook extends Book{
    AudioBook(String title, String author, int dayTaken, int dayDue){
        super(title, author, dayTaken, dayDue);
    }
    int daysOverdue(int today){
        return today - dayDue;
    }
    boolean isOverdue(int today){
        return today > dayDue;
    }
    int computeFine(int today){
        return daysOverdue(today) * 2;
    }
}


public class IBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the title of the book: ");
            String title = sc.next();
            System.out.println("Enter the author of the book: ");
            String author = sc.next();
            System.out.println("Enter the day taken: ");
            int dayTaken = sc.nextInt();
            System.out.println("Enter the day due: ");
            int dayDue = sc.nextInt();
            System.out.println("Enter the type of the book: ");
            String type = sc.next();
            if(type.equals("Regular")){
                books[i] = new RegularBook(title, author, dayTaken, dayDue);
            }
            else if(type.equals("Ref")){
                books[i] = new RefBook(title, author, dayTaken, dayDue);
            }
            else if(type.equals("Audio")){
                books[i] = new AudioBook(title, author, dayTaken, dayDue);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(books[i]);
        }
    }
    
}