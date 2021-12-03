/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin.CreatingQuiz;

/**
 *
 * @author Jason
 */
import java.io.Serializable;
public class QuizItem implements Serializable {
   
    String quizID;
    String question;
    String choice1;
    String choice2;
    String choice3;
    String choice4;
    String answer;
    
 public   QuizItem( String quizID,String question,String choice1,String choice2,String choice3,String choice4,String answer){
        setQuizID(quizID);
        setQuestion(question);
        setChoice1(choice1);
        setChoice2(choice2);
        setChoice3(choice3);
        setChoice4(choice4);
        setAnswer(answer);
    }
    
        public void setQuizID(String quizId){
         this.quizID = quizId;
    }
        public void setQuestion(String question){
            this.question = question;
    }
        public void setChoice1(String choice1){
            this.choice1 = choice1;
    }
        public void setChoice2(String choice2){
         this.choice2 = choice2;
    }
        public void setChoice3(String choice3){
         this.choice3 = choice3;
    }
        public void setChoice4(String choice4){
         this.choice4 = choice4;
    }
        public void setAnswer(String answer){
         this.answer = answer;
    }
    
        public String getQuizID(){
        return this.quizID;
    }
        public String getQuestion(){
        return this.question;
    }
        public String getChoice1() {
        return this.choice1;
    }
        public String getChoice2() {
        return this.choice2;
    }
        public String getChoice3() {
        return this.choice3;
    }
        public String getChoice4() {
        return this.choice4;
    }
        public String getAnswer() {
        return this.answer;
    }
    
}
