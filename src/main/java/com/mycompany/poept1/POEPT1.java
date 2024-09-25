/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poept1;

import POE.POEclass;


/**
 *
 * @author RC_Student_lab
 */
public class POEPT1 {

    
     

    public static void main(String[] args) {
       POEclass external= new POEclass();
       
       external.Username_Prompt();
       if (external.checkUsername()){
           System.out.println("Username is correct.");
           System.out.println("Welcome User !");
       }
       else {
           System.out.println("Username must not be more than 5 characters and should contain an (_)");
           System.out.println("Username is incorrect , please try again!");
           
       }
       if (external.checkUsername()){
           external.PasswordPrompt();
       }
       
        
       
       
    }
      
      
      
    
     
        
     
        
      
        
      
}
      
    
      



