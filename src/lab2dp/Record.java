
package lab2dp;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

public class Record {
 
   static  ArrayList<User> users = new ArrayList<User>();
    
   
   static void setUser(User user){
       
       users.add(user);
       
       
   }
   
   static boolean isUser(String email , String password){
      User user = new User(email ,password);
       for (int i = 0 ;i<users.size();i++){
           
           if (users.contains(user))
           {
               
               return true;
           }
           
       }
       
       return false;
       
   }
   
}


class User {
 String userEmail;
 String userPassword;
    
 
 User(String email , String password){
     
     
     this.userEmail = email;
     this.userPassword = password;
     
 }
    
}
