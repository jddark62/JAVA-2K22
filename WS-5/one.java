/*
This structure contains two classes in which ShortAnswerQuestion inherits from Question. To build the classes shown in the figure, note the following:
The Question class is a new class with the following features: 
It is an abstract class;
It includes a constructor method that receives a String and stores it in the private variable myText;
It includes a public accessor method getText() for myText; 
It includes abstract method specifications for getQuestion(), getAnswer() and checkAnswer(), whose signatures should match those used in the original ShortAnswerQuestion; 
The ShortAnswerQuestion class is just like the original with the following modifications: 
It now extends the Question class; 
It inherits myText and its getText() accessor method from Question so it doesn’t need to implement it anymore; 
Its constructor method starts with a call to super(text), where text is the parameter holding the question text; 
Its three concrete method definitions are marked with @Override to alert the programming environment that their signatures should match the inherited abstract method signatures. 
The getQuestion() accessor method calls the parent method getText() in order to gain access to the text instance variable.

*/

import java.util.Scanner;

abstract class Question {
    private String myText;
    
    public Question(String text) {
        myText = text;
    }
    
    public String getText() {
        return myText;
    }
    
    public abstract String getQuestion();
    public abstract String getAnswer();
    public abstract boolean checkAnswer(String answer);
}

class ShortAnswerQuestion extends Question {
    public ShortAnswerQuestion(String text) {
        super(text);
    }
    
    @Override
    public String getQuestion() {
        return getText();
    }
    
    @Override
    public String getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your answer: ");
        return input.nextLine();
    }


    
    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(getAnswer());
    }
}

public class one {
    public static void main(String[] args) {
        ShortAnswerQuestion q = new ShortAnswerQuestion("What is the capital of the United States?");
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer());
        System.out.println(q.checkAnswer("Washington"));
    }
}