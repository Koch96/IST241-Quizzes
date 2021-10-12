
package quizzes;

import java.util.Scanner;


//@author sak5680

public class Quizzes {
//    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("What country was inventor born in? ");
        q2.addChoice("Australia", false);
        q2.addChoice("Canada", true);
        q2.addChoice("France", false);
        q2.addChoice("United States", false);     
    }
    
    public static void presentQuestion(ChoiceQuestion q){
        q.display();
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        System.out.println(q.checkAnswer(response));
    }

}
