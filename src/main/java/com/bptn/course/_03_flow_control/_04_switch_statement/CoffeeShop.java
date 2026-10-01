package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("\nWelcome to JavaBean Café!");
        System.out.println("Please select a drink:");
        System.out.print("Enter your choice (1-5): ");
        
        int choice = scanner.nextInt();
        String drink = null;
        double price = 0;
        
        
        switch (choice) {
        case 1:
        	drink = "Espresso";
        	price = 3.00;
        	break;
        case 2:
        	drink = "Chai Latte";
        	price = 4.50;
        	break;
        case 3:
        	drink = "Cappuccino";
        	price = 4.00;
        	break;
        case 4:
        	drink = "Americano";
        	price = 3.50;
        	break;
        case 5:
        	drink = "Matcha";
        	price = 4.75;
        	break;
        default:
        	System.out.println("Invalid option. Try again by selecting a number from 1-5.");
        	return;
        }
        

        System.out.printf("You selected %s. Price: $%.2f%n", drink, price);
        System.out.println("Thank you for your order!");
        scanner.close();
    }
}
