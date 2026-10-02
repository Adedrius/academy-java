package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.print("How many items are you buying? ");
        int itemCount = scanner.nextInt();

        for (int i = 1; i <= itemCount; i++) {
          System.out.print("Enter price for item " + i + ": ");
          double itemPrice = scanner.nextDouble();
          total = total + itemPrice;
        }

        System.out.printf("Total amount: $%.2f%n", total);
        scanner.close();
    }
}
