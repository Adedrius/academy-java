package com.bptn.course._02_scanner;

//FREEZE CODE BEGIN
import java.util.Scanner;

public class UserInfo {
 public static void main(String[] args) {      
     // Create an object from scanner class
     Scanner myObj= new Scanner(System.in);
     
     // Print a statement on the console
     System.out.println("Enter you name , favourite city, age and salary");
//FREEZE CODE END
     // Get string input for name
     String name = myObj.nextLine();
         
     // Get string input for fav city
     String favCity = myObj.nextLine();
     
     // Get numerical input for user's age
     int age = myObj.nextInt();
     
     // Get numerical input for user's salary
     float salary = myObj.nextFloat();
         
//FREEZE CODE BEGIN     
     // Output of all the inputs provided by the user
     System.out.println("Name: "+ name);
     System.out.println("Favourite city : "+ favCity);
     System.out.println("Age : "+ age);
     System.out.println("Salary : "+ salary);
     
     myObj.close();
 }
}
//FREEZE CODE END
