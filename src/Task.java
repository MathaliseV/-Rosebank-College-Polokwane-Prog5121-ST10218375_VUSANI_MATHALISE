/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import java.util.Scanner;

/**
 *
 * @author hopev
 */
public class Task
{
     String[] name_of_Task;
    int number_of_Task;
    String[] description_of_Task;
    String[] developer_Details;
    int[] duration_of_Task;
    String[] task_ID;
    String[] task_Status;
    
    public Task(int numberofTask)
    {
        name_of_Task = new String[numberofTask];
        number_of_Task = 0;
        description_of_Task = new String[numberofTask];
        developer_Details = new String[numberofTask];
        duration_of_Task = new int[numberofTask];
        task_ID = new String[numberofTask];
        task_Status = new String[numberofTask];
        
    }        
    public boolean checkTaskDescription(String Description)
    {
        if(Description.length() <= 50)
            return true;
        else
            return false;
    }
    public String createTaskID(int taskNumber)
    {
        task_ID[taskNumber] = name_of_Task[taskNumber].substring(0, 2) + ":" + taskNumber + ":" + developer_Details[taskNumber].substring(developer_Details[taskNumber].length() - 3).toUpperCase();
        return task_ID[taskNumber];
    }
    public void printTaskDetails(int TotalTasks)
    {
        System.out.println("/n/nTasks saved so far.../n");
        System.out.println("/n/ttaskId/ttaskName/tDuration/tStatus/tDescription/tDeveloper/n");
        for(int a = 0;a < TotalTasks ; a++)
        {
            System.out.print("/n" + (a+1) + "./t" + task_ID[a] + "/t" + name_of_Task[a] + "/t" + duration_of_Task[a] + "/t" + task_Status[a] + "/t" + description_of_Task[a] + "/t" + developer_Details[a]);
        }
        System.out.print("/n/nTotal task duration : " + returnTotalHours(TotalTasks) + "/n/n");
    }
    public int returnTotalHours(int TotalTasks)
    {
        int Totalhours = 0;
        for(int a = 0; a < TotalTasks; a++)
            Totalhours = Totalhours + duration_of_Task[a];
        return Totalhours;
    }    
}
   

