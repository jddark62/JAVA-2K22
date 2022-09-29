/*
Your new question classes are similar to ShortAnswerQuestion , 
but they must implement the three abstract methods specified by Question each in their 
own unique way: 
The FillInBlankQuestion class is just like the ShortAnswerQuestion class 
with the following modifications: 
Its getQuestion() method must append the string "\nFill in the blank." 
to the end of the question text. Note: 
The question text itself does not change! 
Use the getText() accessor to get the main text of the question,
 and then use string concatenation to add "\nFill in the blank." ; 
The TrueFalseQuestion class is just like the ShortAnswerQuestion class 
with the following modifications: 
Its myAnswer data attribute is a boolean and the explicit-value 
constructor receives a boolean value for the answer; 
Its getQuestion() method must append the string
 "\nIs this statement true or false?" to the end of the question text; 
Its getAnswer() method must still return a string 
(to match the abstract method it is overriding), 
so it needs to cast the boolean answer into a string (i.e., into "true" or "false") - you can do this using new Boolean(myAnswer).toString(); 
Its checkAnswer() method must compare the string received from the calling program (answer) against a string version of the correct answer - you can do this using getAnswer().equalsIgnoreCase(answer)). 
You don’t need to change the quiz mechanism in any way because it is using the standard API specified in Question to manipulate the questions. That is, it is using getQuestion() , getAnswer() and checkAnswer() as specified by the abstract methods inherited by all sub-classes of Question 

Question

-myText string
+getQuestion()
+getAnswer()
+checkAnswer()
+getText()

ShortAnswerQuestion

-myAnswer string

+getAnswer()
+getQuestion()
+checkAnswer()

FillInBlankQuestion

-myAnswer string

+getAnswer()
+getQuestion()
+checkAnswer()

TrueFalseQuestion

-myAnswer Boolean

+getAnswer()
+getQuestion()
+checkAnswer()




*/

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
    private String myAnswer;
    
    public ShortAnswerQuestion(String text, String answer) {
        super(text);
        myAnswer = answer;
    }
    
    public String getAnswer() {
        return myAnswer;
    }
    
    public String getQuestion() {
        return super.getText();
    }
    
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(myAnswer);
    }
}

class FillInBlankQuestion extends ShortAnswerQuestion {
    public FillInBlankQuestion(String text, String answer) {
        super(text, answer);
    }
    
    public String getQuestion() {
        return super.getText() + "\nFill in the blank.";
    }

    public boolean checkAnswer(String answer) {
        return super.checkAnswer(answer);
    }

    public String getAnswer() {
        return super.getAnswer();
    }


}

class TrueFalseQuestion extends ShortAnswerQuestion {
    public TrueFalseQuestion(String text, boolean answer) {
        super(text, new Boolean(answer).toString());
    }
    
    public String getQuestion() {
        return super.getText() + "\nIs this statement true or false?";
    }
    
    public boolean checkAnswer(String answer) {
        return super.checkAnswer(answer);
    }
    
    public String getAnswer() {
        return super.getAnswer();
    }
}

/**
 * two
 */
public class two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Question q1 = new ShortAnswerQuestion("Who is the president of the United States?", "Donald Trump");
        System.out.println(q1.getQuestion());
        System.out.println(q1.getAnswer());
        System.out.println(q1.checkAnswer("Donald Trump"));
        System.out.println(q1.checkAnswer("Bill Clinton"));
        
        Question q2 = new FillInBlankQuestion("What is the capital of the United States?", "Washington D.C.");
        System.out.println(q2.getQuestion());
        System.out.println(q2.getAnswer());
        System.out.println(q2.checkAnswer("Washington D.C."));
        System.out.println(q2.checkAnswer("New York"));
        
        Question q3 = new TrueFalseQuestion("The United States is a country.", true);
        System.out.println(q3.getQuestion());
        System.out.println(q3.getAnswer());
        System.out.println(q3.checkAnswer("true"));
        System.out.println(q3.checkAnswer("false"));

        
    }
    
}

