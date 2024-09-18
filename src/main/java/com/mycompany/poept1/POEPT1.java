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
       
       external.Prompt();
        
       if (external.checkUsername(username)){
           System.out.println("Username is correct");
       } else{
           System.out.println("Username must contain an _");
       }
    }
        
     
        
      
        
      
}
      
    
      



