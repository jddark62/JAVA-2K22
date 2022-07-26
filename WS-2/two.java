/*
 * Implement a class Student. 
 * For the purpose of this exercise, a student has a name 
 * and a total quiz score. 
 * Supply an appropriate constructor and methods 
 * getName(), 
 * addQuiz(int score), 
 * getTotalScore(), and 
 * getAverageScore(). 
 * To compute the latter, you also need to store the number of quizzes 
 * that the student took.

 */

import java.util.Scanner;

class Student{
    private String name;
    private double totalScore;
    private int numberOfQuizzes;
    
    //constructor 
    public Student(String name){
        this.name = name;
        totalScore = 0;
        numberOfQuizzes = 0;
    }

    //getter method getName()
    public String getName(){
        return name;
    }

    public void addQuiz(int score){
        totalScore += score;
        numberOfQuizzes++;
    }

    public double getTotalScore(){
        return totalScore;
    }

    public double getAverageScore(){
        return totalScore/(double)numberOfQuizzes;
    }


}
/**
 * two
 */
public class two {

    public static void main(String[] args) {
        System.out.println("Enter the student name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student student = new Student(name);
        System.out.println("Enter the quiz score: ");
        int score = input.nextInt();
        student.addQuiz(score);
        System.out.println("The student's name is " + student.getName());
        System.out.println("The student's total score is " + student.getTotalScore());
        System.out.println("The student's average score is " + student.getAverageScore());
    }
}