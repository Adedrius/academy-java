package com.bptn.course._07_exception_handling;
import java.util.Scanner;

public class ExceptionsDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the index you want to access : ");
		int index = input.nextInt();
		
		try {
			 System.out.println(arr[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a valid index!");
		}
	}
		// System.out.println(arr[3]/0);
}
