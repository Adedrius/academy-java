package com.bptn.course._03_flow_control._01_while_loop;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        int pin;
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);
        

        do {
          if (attempts >= 3) {
            System.out.println("Incorrect PIN. Account locked.");
            scanner.close();
          }

          System.out.print("Enter your 4-digit PIN: ");
          pin = scanner.nextInt();

          if (pin != CORRECT_PIN) {
            System.out.println("Incorrect PIN. Try again.");
            attempts++;
          } else {
            System.out.println("Access granted. Welcome!");
          }

        } while (pin != CORRECT_PIN);
        
        scanner.close();
    }
}
