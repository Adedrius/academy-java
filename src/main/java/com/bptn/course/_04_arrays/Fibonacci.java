package com.bptn.course._04_arrays;

public class Fibonacci {
    public static void main(String[] args) {

        // Predefined numbers to start off the Fibonacci series:
        int num1 = 0; int num2 = 1;

        // Print the first two numbers of the Fibonacci series:
        int[] nums = new int[10];
        nums[0] = num1;
        nums[1] = num2;

        // Print the next 8 numbers of the Fibonacci series:
        for (int i = 2; i < nums.length; i++) {
          nums[i] = nums[i - 1] + nums[i - 2];
          

        }

        for (int i = 0; i < 10; i++) {
          System.out.print(nums[i] + " ");
        }
    
    }
}
