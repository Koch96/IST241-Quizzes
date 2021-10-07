
package quizzes;

import java.util.Scanner;


//@author sak5680

public class Quizzes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
//        Question q = new Question();
//        q.setText("Who was the inventor of Java?");
//        q.setAnswer("James Gosling");
        
//        q.display();
//        System.out.print("Your answer: ");
//        String response = in.nextLine();
//        System.out.println(q.checkAnswer(response));
        
        ChoiceQuestion q2 = new ChoiceQuestion();
        q2.setText("What country was inventor born in? ");
        q2.addChoice("Australia", false);
        q2.addChoice("Canada", true);
        q2.addChoice("France", false);
        q2.addChoice("United States", false);
        
        q2.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q2.checkAnswer(response));
    }

}
