
package lab2dp;


public class Validation_Abst_Implementation {
    
}


class Validation implements Validator {
    
    @Override
    public boolean emailValidator(String email) {
       if (email.isEmpty()){
           message("Please Enter Email");
           return false;
           
       }
       else if (!email.contains("@gmail.com")){
        
           message("You Enter Invalid Email");
           
           return false;
    }
       else if (email.length()<12){
           
          message("Your Email Should Not Be Less Than 12 Character");
           
           return false;
       }
       
       else {
           return true;
       }
    }

    @Override
    public boolean passwordValidator(String password) {
        
        if (password.length()<8){
            
           message("Your Password Should be greater Than * Character ");
            return false;
        }
        
        else{
            
            return true;
        }
   
    }

    @Override
    public String message(String message) {
        System.out.println("Message :  "+message);
      return message;
    }
    
  
    
}
