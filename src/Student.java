

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Student  {
   
    
    public static void main (String args []){
        //for Leaderboard Code example 
        example baboy = new example("Baboy", 290); 
        example baka = new example("Baka", 400); 
        example nganga = new example("nganga", 0);

        ArrayList<example> listOfKarne = new ArrayList<>(); 
        listOfKarne.add(baboy); 
        listOfKarne.add(baka); 
        listOfKarne.add(nganga);
        
      
        Comparator<example> feeComparator = (baligya1, baligya2) -> (int) (baligya1.fee() - baligya2.fee());


        listOfKarne.sort(Collections.reverseOrder(feeComparator));
     
        System.out.println("\n\nThe Loops:");
        for(int i = 0; i < listOfKarne.size(); i++ ){
            System.out.println("\nKARNE: "+"\nTitle: " + listOfKarne.get(i).title()+"\nPresyo: " +listOfKarne.get(i).fee());
        }

        
    }
}

class example implements Serializable{ 
    String title; long fee; 
    public example(String title, long fee){ 
        this.title = title;
        this.fee = fee; 
    }
    public String title(){ 
        return title; 
    } 
    public long fee(){ 
        return fee; 
    }
   
}

