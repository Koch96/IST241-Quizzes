package quizzes;

/** @author sak5680 */

public class NumericQuestion extends Question{
    
    public NumericQuestion(){
        text = "";
        answer = "";
    }
    
//    public void setText(String t){
//        text = t;
//    }
    
//    public void setAnswer(String a){
//        answer = a;
//    }
    
    public boolean checkAnswer(double response) {
        double answer2 = Double.parseDouble(answer);
        return response == answer2;
    }
    
    public void display() {
        System.out.println(text);
    }
}
