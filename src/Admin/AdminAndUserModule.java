/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import java.io.Serializable;

/**
 *
 * @author Jason
 */
public class AdminAndUserModule   implements Serializable {
    String Id;
    String username;
    String password;
    String lastname;
    String firstname;
    String user;
  public  AdminAndUserModule(String Id ,String username,String password,String lastname,String firstname, String user ){
        setUser(user);
        setId( Id);
        setUsername(username);
        setPassword(password);
        setFirstname(lastname);
        setLastname(firstname);
    }
     
    public void setId(String Id){
         this.Id = Id;
    }
     public void setUser(String user){
         this.user = user;
    }
    public void setUsername(String username){
            this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getId(){
        return this.Id;
    }
    public String getUser(){
        return this.user;
    }
}
