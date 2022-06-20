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
public class Login 
{
  public String Username = "";
    public String Password ="";
    
    public boolean checkUsername(String Uname)
    {
    boolean UserNamePassed;
    UserNamePassed= false;
    
    boolean Length;
    Length =false;
    boolean SpeciChar;
    SpeciChar =false;
    
    if(Uname.length() >= 5)
    {
    Length = true;
    }
    char[] SpecialChara = {'_',};
    for(int a = 0; a < Uname.length(); a++)
    {
        for(int b = 0; b < 1; b++)
        {
            if(Uname.charAt(a) == SpecialChara[b])
            {
            SpeciChar = true;
            }
        }
    }
        if(Length ==true && SpeciChar ==true)
    {
         UserNamePassed =true;
    }   
    return UserNamePassed;
  }    
    
    
    public boolean checkpasswordcomplexity(String Pword)
    {
    boolean PassWordPassed;
    PassWordPassed = false;
    
    boolean Length;
    Length =false;
    boolean CapLetters;
    CapLetters =false;
    boolean Numbers;
    Numbers =false;
    boolean SpecChara;
    SpecChara =false;
    
    if(Pword.length() >= 8)
    {
    Length =true;
    }
    
       char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       for(int a = 0; a< Pword.length(); a++)
       {
            for(int b = 0; b < 26; b++)
            {
                if(Pword.charAt(a) == alphabets[b])
                {
                CapLetters =true;
                b = 28;
                a = Pword.length()+2;
                }
            
            }
            
       }   
   
       char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
       for(int a= 0; a < Pword.length();a++ )
       {
           for(int b = 0; b < 10; b++)
           {
                if(Pword.charAt(a) == numbers[b])
                {
                    Numbers =true;
                }
            }
       }
    
    char[] SpecialChar = {'!','@','#','$','%','^','&','*','(',')','_','+','~','{','}','[',']',';',':','"','<',',','>','.','?','/'};
    for(int a= 0; a < Pword.length(); a++)   
    {
        for(int b = 0; b < 26; b++)
        {
            if(Pword.charAt(a) == SpecialChar[b])
            {
                SpecChara =true;
            }
        }
    }
    if(Length ==true && CapLetters ==true && Numbers ==true && SpecChara ==true)
    {
         PassWordPassed =true;
    }
    return PassWordPassed;
    }
 
    
  boolean LoginUser()
  {
      boolean LoginSuccess;
      LoginSuccess=false; 
      
    return LoginSuccess;
  }
  
  String RegisterUser()
  {
      Scanner Input = new Scanner(System.in);
      String FirstName;
      String Lastname;       
      String UserName = "";        
      String Password = "";
      
      System.out.print("\n\n\t\tRegistration\n\n");
      System.out.println("Enter Firstname : ");
      FirstName =Input.next();
      System.out.println("Enter Lastname : ");
      Lastname =Input.next();
      while(!checkUsername(UserName))
            {
                System.out.println("Enter Username : "); 
                UserName =Input.next();
            }
      
      while(!checkpasswordcomplexity(Password))
            {
                System.out.println("Enter Password : "); 
                Password  =Input.next();
            }
      
        return "\n\n\t\tUser Succesfully registered!\n\n";
  }
  
  String ReturnLoginStatus()
  {
      String ReturnStatus = "Checking information on system";
      if(true)
      {
          ReturnStatus = "You have been successfully logged in to the system!";
      }
      else
      {
          ReturnStatus = "Login Failed";
      }
      
  return ReturnStatus;
  }
}


  