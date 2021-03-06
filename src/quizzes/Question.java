package quizzes;

/** @author sak5680 */

// A question with a text and an answer.
public class Question {
    protected String text;
    protected String answer;
    
    // Constructs a questino with empty question and answer.
    public Question(){
        text = "";
        answer = "";
    }
    
    // Sets the question text. @param questionText the text of this question.
    public void setText(String t){
        text = t;
    }
    
    // Sets the answer for this question. @param correctResponse the answer.
    public void setAnswer(String a){
        answer = a;
    }
    
    // Checks a given response for correctness.
    // @param response the reponse to check
    // @return true if the response was correct, false otherwise
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }
    
    // Displays this question.
    public void display() {
        System.out.println(text);
    }
}
