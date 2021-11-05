
package quizzes;

import java.util.Scanner;


//@author sak5680

// This program shows a simple quiz with one question.
public class Quizzes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        NumericQuestion q2 = new NumericQuestion();
        q2.setText("What is 3 * 20?");
        q2.setAnswer("60");
                
        q2.display();
        System.out.print("Your answer: ");
        String response = sc.nextLine();
        System.out.println(q.checkAnswer(response));
    }

}
