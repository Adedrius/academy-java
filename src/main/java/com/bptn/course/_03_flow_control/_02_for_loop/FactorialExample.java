package com.bptn.course._03_flow_control._02_for_loop;
import java.util.Scanner;

class FactorialExample{  
 public static void main(String args[]){  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int fact = 1;

        for (int i = number; i >= 1; i--) {
          fact = fact * i;
        }
        
        System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}