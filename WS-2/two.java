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
        
        Student student = new Student("Ronaldo");
        student.addQuiz(80);
        student.addQuiz(50);
        student.addQuiz(80);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Total Score is: " + student.getTotalScore());
        System.out.println("Average Score is: " + student.getAverageScore());
    }
}