/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poept1;
import POE.POEclass;
import POE.Task;
import javax.swing.*;
import java.util.Scanner;




/**
 *
 * @author RC_Student_lab
 */
public class POEPT1 {
    public static void main(String[] args) {
        POEclass external = new POEclass();


external.Userdetails();
external.RegisterUser();

if (external.login_Status()); {
            external.LoginUser();
           JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
           
          String option;
            do {
                
                option = JOptionPane.showInputDialog(null, "====Menu==== \n1. Add tasks \n2. Coming Soon \n3. Quit", "Menu", JOptionPane.QUESTION_MESSAGE);

                
             switch (option) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "You chose to Add tasks.");

                        
                        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks you wish to add:"));

                        Task[] tasks = new Task[numTasks]; 

                        for (int i = 0; i < numTasks; i++) {
                            String taskName = JOptionPane.showInputDialog("Enter name of task " + (i + 1) + ":");

                  
                            String taskDescription;
                            do {
                                taskDescription = JOptionPane.showInputDialog("Enter description of task " + (i + 1) + " (should not exceed 50 characters):");
                                if (taskDescription.length() > 50) {
                                    JOptionPane.showMessageDialog(null, "Description is too long, please enter less than 50 characters.");
                                }
                            } while (taskDescription.length() > 50);

                            
                            String developerFirstName = JOptionPane.showInputDialog("Enter the first name of the developer for task " + (i + 1) + ":");
                            String developerLastName = JOptionPane.showInputDialog("Enter the last name of the developer for task " + (i + 1) + ":");

                    
                            double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter duration of task " + (i + 1) + " in hours:"));

                            
                            String taskStatus = JOptionPane.showInputDialog("Enter status for task " + (i + 1) + ":\n1. To Do\n2. Done\n3. Doing");
                            switch (taskStatus) {
                                case "1":
                                    taskStatus = "To Do";
                                    break;
                                case "2":
                                    taskStatus = "Done";
                                    break;
                                case "3":
                                    taskStatus = "Doing";
                                    break;
                                default:
                                    taskStatus = "To Do"; 
                            }

                            
                            tasks[i] = new Task(taskName, taskDescription, developerFirstName, developerLastName, taskDuration, taskStatus);
                        }

                       
                        StringBuilder taskDetails = new StringBuilder();
                        for (int i = 0; i < tasks.length; i++) {
                            taskDetails.append(tasks[i].printTaskDetails()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, taskDetails.toString());

                       
                        double totalHours = Task.returnTotalHours(tasks);
                        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
                        break;

                    case "2":
                        JOptionPane.showMessageDialog(null, "Coming soon.");
                        break;

                    case "3":
                        JOptionPane.showMessageDialog(null, "Goodbye!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
                        break;
                }
            } while (!option.equals("3")); 
        }
    }   
      
}

        

      
    
      



