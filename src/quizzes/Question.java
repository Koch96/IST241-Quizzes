package quizzes;

/** @author sak5680 */

public class Question {
    protected String text;
    protected String answer;
    
    public Question(){
        text = "";
        answer = "";
    }
    
    public void setText(String t){
        text = t;
    }
    
    public void setAnswer(String a){
        answer = a;
    }
}
