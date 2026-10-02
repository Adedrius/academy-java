package com.bptn.course._04_arrays;

//FREEZE CODE BEGIN
public class FindOddPosInArray {  
 public static void main(String[] args) {  
     
     int [] numbers = new int [] {10, 20, 30, 40, 50};  

     System.out.println("At odd indexes, the elements are: ");
//FREEZE CODE END

     // Add your code here
     for (int i = 0; i < numbers.length - 1; i++) {
       if (i % 2 == 1) {
         System.out.println(numbers[i]);
       }
     }


 }  
}  
