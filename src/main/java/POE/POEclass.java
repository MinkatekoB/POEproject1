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
    String name;
    String password;
    
    
//Make sure the user username contains an underscore
public boolean checkUsername(String name){
    return name.contains("_");
}
//make sure the user password meets all its conditions
public boolean checkPasswordComplexity(){
    return password.length()>8 && password.contains(name); 
    
}
public void Prompt(){
    Scanner User_input = new Scanner ( System.in);
    System.out.println("Please enter your username");
    name= User_input.nextLine();
    
    System.out.println("Please enter your password");
    password= User_input.nextLine();
    
}
}