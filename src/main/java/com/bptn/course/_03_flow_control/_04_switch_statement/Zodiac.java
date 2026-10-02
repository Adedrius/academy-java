package com.bptn.course._03_flow_control._04_switch_statement;


public class Zodiac {

	public static void main(String[] args) {
		int year = 1996; // Using any year value
		String animal = ""; // Declaring the animal variable.
    
		switch (year % 12) { // I added an modulo (%) operator instead, because we want the remainder
                         // instead of the quotient. The division sign there before won't give integer 
                         // values.
		case 0:
			animal = "monkey";
      break; // Added a break statement in EVERY case, so it immediately exits the switch case structure and doesn't 
             // fall through to the end and assign the wrong animal value. It was originally assigning "goat" for every 
             // year and I knew it had to do with there not being break statements.
		case 1:
			animal = "rooster";
      break;
		case 2:
			animal = "dog";
      break;
		case 3:
			animal = "pig";
      break;
		case 4:
			animal = "rat";
      break;
		case 5:
			animal = "ox";
      break;
		case 6:
			animal = "tiger";
      break;
		case 7:
			animal = "rabbit";
      break;
		case 8:
			animal = "dragon";
      break;
		case 9:
			animal = "snake";
      break;
		case 10:
			animal = "horse";
      break;
		case 11:
			animal = "goat";
      break;
		}

		System.out.println("The year " + year + " was the year of the " + animal); // The year is matched with the correct animal successfully.

	}

}

// SUMMARY: One thing about this task that was new was realizing how important the "break" statement is.
// I took me a bit to realize, but when I did and the output immediately corrected itself, I knew break 
// statements are very crucial to a switch-case operating as the user wants. Some issues I ran to along 
// the way is matthemetically knowing the remainders of the division of large number years so using smaller 
// values would've been more helpful to test against the modulus of 12. From this exercise, I will now always 
// rememeber to add break statements in my switch cases and not cause unnecessary bugs.

