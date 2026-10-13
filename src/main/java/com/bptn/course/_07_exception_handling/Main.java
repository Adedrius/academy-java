package com.bptn.course._07_exception_handling;

public class Main {
    
    // Method to demonstrate exception propagation
	public void method() {
		try {
			try {
				int[] arr = {1, 2, 3, 4};
				int dividebyZero = arr[0] / 0;
				System.out.println(dividebyZero);
				System.out.println(arr[5]);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ArithmeticException occured");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		}
	}
     
    
    // Method to handle exception and demonstrate propagation
    
    
    // main() method to run the program
    public static void main(String args[]) {
        Main exceptionSolutionObject = new Main();
        exceptionSolutionObject.method(); // Calling method2 to demonstrate exception propagation
    }
}
