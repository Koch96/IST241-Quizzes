package quizzes;

/** @author sak5680 */
public class NumericQuestion {
    protected String text;
    protected String answer;
    
    // Constructs a questino with empty question and answer.
    public NumericQuestion(){
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
    public boolean checkAnswer(double response) {
        double answer2 = Double.parseDouble(answer);
        
        return (response == answer2);
    }
    
    // Displays this question.
    public void display() {
        System.out.println(text);
    }
}
