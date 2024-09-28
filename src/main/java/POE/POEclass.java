/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POEclass {
    String username;
    String password;
    String firstname;
    String lastname;
    
    
    public void userDetails(){
        System.out.println("=========User Registration==========");
        Scanner User_input  =  new Scanner(System.in);
        System.out.println("Please enter your First Name :");
        User_input.nextLine();
        System.out.println("Please enter your Last Name :");
        User_input.nextLine();
                
        
    }
    
//Make sure the user username contains an underscore
public boolean checkUsername(){
  return  username.contains("_") && username.length()<6;
}

    
public void PasswordPrompt(){
    
    
    Scanner User_input  =  new Scanner(System.in);
    System.out.println("Please enter your password :");
    password = User_input.nextLine();
}
//make sure the user password meets all its conditions
public boolean checkPasswordComplexity(){
    if (password.length() > 8) {
            return false;
        }

        boolean hasSpecialChar = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Define a regex pattern for special characters
        String specialCharacters = "!@#$%^&*()-+=<>?";

        // Iterate through the password characters
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.indexOf(c) >= 0) {
                hasSpecialChar = true;
            }
        }

        // Return true only if all conditions are met
        return hasSpecialChar && hasUppercase && hasDigit;
    }
 

//Prompting user for details

    public void Username_Prompt(){
        System.out.println("========User Login========");
    Scanner User_input = new Scanner ( System.in);
    System.out.println("Please enter your username: ");
    username= User_input.nextLine();
    
   
    
}
public void RegisterUser(){
    
    if(checkUsername()){
        System.out.println("Username captured successfully."); 
    }
    else{
        System.out.println("Username is incorrect , Username must contain a (_) and must not be more than 5 characters. Please try again. ");
    }
    
    
    if (checkUsername()){
           PasswordPrompt();
    }
    
    if(checkPasswordComplexity()){
        System.out.println("Password captured successfully.");
    } else{
        System.out.println("Password incorrect ! , password should contain a number , a capital letter , a special character and should not be more than 8 characters , please try again.");
    }

    }

public boolean  login_Status(){
    if (checkUsername()&&(checkPasswordComplexity()) ){
        System.out.println("Login attempt succesful");
        return true;
    }
    else 
    {System.out.println("Login attempt unsuccessful, please try again");
    }return false;
    

}
public void LoginUser(){
    if (login_Status()){
        
        System.out.println("Welcome! "+firstname+""+lastname+"Its great to see you again !");
    }
}
}
        
        









