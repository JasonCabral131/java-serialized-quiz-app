/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Users.Main;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class QuizResult implements Serializable  {
    
    String username;
    int  score;
    String date;
    String level;
    public QuizResult(String username, int score,String date,String level){
        setUsername(username);
        setScore(score);
        setDate(date);
        setLevel(level);
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setLevel(String level){
        this.level = level;
    }
    
    public String getUsername(){
        return this.username;
    }
    public Integer getScore(){
        return this.score;
    }
    public String getDate(){
        return this.date;
    } 
    public String getLevel(){
        return this.level;
    }
    
}
