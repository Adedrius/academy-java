package com.bptn.course._09_java_collections_framework;

//Import the ArrayList class from the java.util package
import java.util.ArrayList;


public class ArrayListExample {
 public static void main(String[] args) {
     // Create an ArrayList of integers to store numbers
	 ArrayList<Integer> arrayList = new ArrayList<>();

     // Add elements to the ArrayList
	 arrayList.add(10);
	 arrayList.add(20);
	 arrayList.add(30);
	 arrayList.add(40);

     
      System.out.println("ArrayList Elements:");
      
     // Access and print elements in the ArrayList using for-each loop
      for (Integer x : arrayList) {
    	  System.out.println(x);
      }
     
    
     // Update an element at index 2 (third element) to 35
      arrayList.set(2, 35);
   
     // Remove an element at index 1 (second element, which is 20)
      arrayList.remove(1);
    

     // Print the size of the ArrayList
     System.out.println("Size of ArrayList: "  + arrayList.size());
 }
}

/* 
 * Create an ArrayList named arrayList to store integers.
 * At the beginning of the program, import the ArrayList class from the java.util package.
 * Add Elements to the ArrayList: Add four integers 10, 20, 30, 40 to the arrayList using the add method.
 * Access and Print Elements: Use a for-each loop to iterate through the arrayList and print each element to the console.
 * Update an Element: Update the element at index 2 (which is 30) to be 35 using the set method.
 * Remove an Element: Remove the element at index 1 (which is 20) from the arrayList using the remove method.
 * Determine the Size: Calculate and print the size of the arrayList using the size method.
 * Compile and Run: Compile and run the Java program to see the output.
 */

