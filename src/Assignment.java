/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment;

import java.util.Scanner;

/**
 *
 * @author hopev
 */
public class Assignment {

    public static void main(String[] args) 
    {
       Scanner Input = new Scanner (System.in);
        String FirstName;
        String Surname;       
        String UserName;        
        String Password;
        
         Login ll = new Login();
         System.out.print(ll.RegisterUser());
         
        boolean LoginStatus = false;
        boolean UsernameCorrect;
        UsernameCorrect = false;
        boolean PasswordCorrect;
        PasswordCorrect = false;

        System.out.println("Enter Username : "); 
        UserName =Input.next();
        System.out.println("Enter Password : "); 
        Password  =Input.next();
        
        LoginStatus = ll.LoginUser();
        UsernameCorrect = ll.checkUsername(UserName);
        PasswordCorrect = ll.checkpasswordcomplexity(Password);
        
        if(PasswordCorrect ==true && UsernameCorrect ==true)
        System.out.print(ll.ReturnLoginStatus());
       
        int numberOfTasks;
        
        System.out.println("welcome to EasyKanban");
        System.out.println("/n/nHow many tasks do you wish to enter : ");
        numberOfTasks = Input.nextInt();
        if(numberOfTasks > 0)
        {
            Task task1 = new Task(numberOfTasks);
            
            System.out.println("/n/nThank you , you may now start capuring the tasks, /n should you wish to Quit just press 3..");
            for(int a = 0; a < numberOfTasks; a++)
            {
                System.out.println("/n/n1).Add tasks");
                System.out.println("/n2).Show report");
                System.out.println("/n3).Quit/n/nPick and option : ");
                
                int option = Input.nextInt();
                if(option == 1)
                {
                   task1.number_of_Task = a;
                    System.out.print("Enter this task's name : ");
                    task1.name_of_Task[a] = Input.next();
                    System.out.print("Enter this task's description : ");
                    task1.description_of_Task[a] = Input.next();
                    while(!task1.checkTaskDescription(task1.description_of_Task[a]))
                    {
                        System.out.print("Description shouldn't be more than 50 characters, Please try again : ");
                        task1.description_of_Task[a] = Input.next();                    
                    }                 
                    
                    System.out.print("Enter this task's developer details : ");
                    task1.developer_Details[a] = Input.next();
                    System.out.print("Enter this task's duration (in hours) : ");
                    task1.duration_of_Task[a] = Input.nextInt();
                    System.out.print("Enter this task status, Choose one from the below \n");
                    System.out.print("\n1. To Do");
                    System.out.print("\n2. Done");
                    System.out.print("\n3. Doing");
                    System.out.print("\nenter number before the option of your choice : ");
                    int choice = Input.nextInt();
                    while(choice < 1 || choice > 3)
                    {
                        System.out.print("\nRange is between 1 and 3, please try again : ");
                        choice = Input.nextInt();                    
                    }
                    if(choice == 1)
                        task1.task_Status[a] = "To Do";
                    if(choice == 2)
                        task1.task_Status[a] = "Done";
                    if(choice == 3)
                        task1.task_Status[a] = "Doing";
                    
                    task1.createTaskID(a);                        
                }
                if(option == 2)
                {
                    task1.printTaskDetails(a);
                    a--;
                }
                if(option == 3)
                {
                    a = numberOfTasks;
                }              
                    
            }    
        }    
    }  
}
 class showReport
 { 
     public static int[] duration_of_Task;
     public static String[] name_of_Task;
     public static String[]  task_ID;
     public static String[] task_Status;
     public static String[] developer_Details;
    
    public static void delete(String tName){
        String[] newTaskName=new String[name_of_Task.length-1];
        int[] newDuration=new int[duration_of_Task.length-1];
        String[] newTaskID=new String[task_ID.length-1];
        String[] newTaskStatus=new String[task_Status.length-1];
        String[] newDevName=new String[developer_Details.length-1];
        
        
        int p=0;
        int pos=0;
        for(int i=0;i<name_of_Task.length;i++){
            if(name_of_Task[i].equals(tName)){
                
                 pos=i;
            }
            else{
               newTaskName[p]=name_of_Task[i];
                p++;
            }
            
        }
        int j=0;
        for(int t=0;t<duration_of_Task.length;t++){
            if(t!=pos){
                newDuration[j]=duration_of_Task[t];
                newTaskID[j]=task_ID[t];
                newTaskStatus[j]=task_Status[t];
                newDevName[j]=developer_Details[t];
                
                
                j++;
            }
            
        }
        
        duration_of_Task=newDuration;
        task_ID=newTaskID;
        task_Status=newTaskStatus;
        developer_Details=newDevName;
        name_of_Task=newTaskName;
        
        
    }
    public static String statusOfDone(){
        String fullDetails="";
        for(int i=0;i<task_Status.length;i++){
            if(task_Status[i].equalsIgnoreCase("Done")){
                fullDetails+=developer_Details[i]+"  "+name_of_Task[i]+"  "+duration_of_Task[i]+"\n";
            }
            
        }
        return fullDetails;
    }
    
    public static String longestDuration(){
        int max=duration_of_Task[0];
        int position=0;
        for(int i=0;i<duration_of_Task.length;i++){
            if(max<duration_of_Task[i]){
                max=duration_of_Task[i];
                position=i;
            }
            
        
        }
        return developer_Details[position]+"  "+max;
    
    }
    
    public static String searchTaskName(String tName){
        String details="";
        for(int i=0;i<name_of_Task.length;i++){
            if(tName.equalsIgnoreCase(name_of_Task[i])){
                details+=name_of_Task[i]+"   "+developer_Details[i]+"   "+task_Status[i]+"\n";
            }
        }
        return details;
    
    }
    
    public static String searchDeveloper(String developerName){
         String details="";
        for(int i=0;i<developer_Details.length;i++){
            if(developerName.equalsIgnoreCase(developer_Details[i])){
                details+=developer_Details[i]+"   "+name_of_Task[i]+"   "+task_Status[i]+"\n";
            }
        }
        return details;
        
    }
    
    
    public static String fullReport(){
          String details="";
        for(int i=0;i<developer_Details.length;i++){
           
                 details+="Task Name "+name_of_Task[i]+"\n"+"Developer Name "+developer_Details[i]+"\n"+"Task ID "+task_ID[i]+"\n"+"Task Duration "+duration_of_Task[i]+"\n"+"Task Status "+task_Status[i]+"\n";
            
        }
        return details;
        
    }
    
    
     
 }
    