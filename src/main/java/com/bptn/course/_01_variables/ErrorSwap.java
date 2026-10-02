package com.bptn.course._01_variables;

public class ErrorSwap {
   public static void main(String[] args) {
     int h = 3; // Original height before swap.
     int w = 5; // Original width before swap.

     System.out.println(h);  //3 is printed out as the original height.
     System.out.println(w);  //5 is printed out as the original width.

     int temp = h; // I added a temporary variable that stores the value of the height variable "h", so that it doesn't lose it's original value and we can refer back to it when swapping.

     h = w; // Since the orignal value of "h" is stored, we can swap its value with "W", or the width of the box.
     w = temp; // Since the value of the height "h" is changed to the original width "w". we refer to its original height value which was stored in the temp variable.

     System.out.println(h);  //expected 5, and that is what is outputted successfully.
     System.out.println(w);  //expected 3, and that is what is outputted successfully.
   }
}

// SUMMARY: In this activity, I knew it would be impossible to swap values of width and height 
// without setting a temporary placeholder variable that holds the original value of either the
// width or the height. I did this because when trying to manually swap with opposing assignments,
// one of the values of width or height would always get lost and it would result in both variables  
// having the same values. Something about this task that was new was efficiently swapping the values
// of two variables with minimal implementation. I was quick to get the solution and ran into no major
// issues.