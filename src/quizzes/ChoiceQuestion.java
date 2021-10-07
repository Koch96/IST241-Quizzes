package quizzes;

import java.util.ArrayList;

/** @author sak5680 */
public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;
    
    public ChoiceQuestion() {
        choices = new ArrayList<>();
    }
    
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    
    public void display() {
        super.display();
    }
}