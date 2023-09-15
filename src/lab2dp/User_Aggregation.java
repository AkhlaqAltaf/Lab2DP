
package lab2dp;

import java.util.ArrayList;

public class User_Aggregation {
   
    private User user;
    public User_Aggregation(User record) {
        
        this.user= record;
        if(isUserAuth()){
            
            System.out.println("Ok This user Is Authenticated ..");
            
        }
        else{
            
            System.out.println("User Is Not Authenticated SO Please Enter True Credentials Or Register");
        }
    }
    
  
        
    public boolean isUserAuth(){
        
       ArrayList<User> arrayList = new ArrayList<User>();
        
       arrayList = Record.users;
       
       if(Record.isUser(user.userEmail, user.userPassword)){
           
           return true;
       }
       else{
           return false;
       }
    }
    
    
    
    
}
