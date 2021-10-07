
package quizzes;

import java.util.Scanner;


//@author sak5680

public class Quizzes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }

}
