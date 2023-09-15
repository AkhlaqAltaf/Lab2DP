
package lab2dp;

import java.util.Scanner;


public class Authenticator_Polymorphism_Encapsulation_Inheritance {
    
}


// Here we implement Polymorphism  to overrtide validator Methods/ Inheritance to extend Validation class 

class InitialFields extends Validation{
    
//    Here we initialize email and password with private 
//    /modifier because we want to not to access it in any class
//    and we want to encapsulate it 
    
private String email;
private String password;
//It is the main reason that why we use inheritance here we will add message again .. 
private String again="";
Scanner scanner = new Scanner(System.in);

public String  email(){
    
    
    message("Please Enter Your Email ".concat(again));
    email = scanner.nextLine();
    if (!emailValidator(email)){
        again = "again";
       return email();
        
    }
    
    return email;
    
    
}
    

public String password(){
    
    message("Please Enter Your Password ".concat(again));
    password = scanner.nextLine();
    
    if (!passwordValidator(password)){
        again = "again";
       return password();
    }
    return password;
}   
}


class RegistrationFields extends InitialFields{
   
   
    
    @Override
    public String email(){
        
        
        return super.email();
        
    }
    
    
    @Override
    public String password (){
        
        return super.password();
    }
     
    
}



