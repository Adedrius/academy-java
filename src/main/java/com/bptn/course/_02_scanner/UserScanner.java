package com.bptn.course._02_scanner;

//FREEZE CODE BEGIN
import java.util.Scanner; // import the Scanner class 

class UserScanner {
 public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);
     String userName;
//FREEZE CODE END

     // Ask the user to enter the username by printing "Enter Username" and read the input given by the user
     System.out.println("Enter Username:");     
     // Fill in the code for the above part below
     userName = myObj.nextLine();
   
//FREEZE CODE BEGIN        
     // Print the username   
     System.out.println("Username is: " + userName);    
 }
}
//FREEZE CODE END