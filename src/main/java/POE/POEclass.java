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
    String specialcharacters = "!@#$%^&*(){}:<>?[]";
    
    
//Make sure the user username contains an underscore
public boolean checkUsername(){
    return username.contains("_") && username.length()<6;
    
}
    
public void PasswordPrompt(){
    Scanner User_input  =  new Scanner(System.in);
    System.out.println("Please enter your password :");
    password = User_input.nextLine();
}
//make sure the user password meets all its conditions
public boolean checkPasswordComplexity(){
    return password.length()<9&& password.contains(specialcharacters) && password.chars().anyMatch(Character::isUpperCase) &&password.chars().anyMatch(Character::isDigit);
}
    

//Prompting user for details
public void Username_Prompt(){
    Scanner User_input = new Scanner ( System.in);
    System.out.println("Please enter your username: ");
    username= User_input.nextLine();
    
   
    
}
public void RegisterUser(){
    
    if(checkUsername()){
        System.out.println("Username captured successfully.");
        
    }
    else{
        System.out.println("Username is incorrect , Username must contain a (_) and must not be more than 5 characters. Please try again.");
    }
    if (checkUsername()){
        PasswordPrompt();
    }
}
}