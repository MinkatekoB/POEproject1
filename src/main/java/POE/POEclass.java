/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;

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
}