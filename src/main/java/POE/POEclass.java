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
    
    
//Make sure the user username contains an underscore
public boolean checkUsername(){
    return username.contains("_");
}
//make sure the user password meets all its conditions
public boolean checkPasswordComplexity(){
    return password.length()>8 && password.contains("_"); 
    
}
//Prompting user for details
public void Prompt(){
    Scanner User_input = new Scanner ( System.in);
    System.out.println("Please enter your username: ");
    username= User_input.nextLine();
    
   
    
}
}