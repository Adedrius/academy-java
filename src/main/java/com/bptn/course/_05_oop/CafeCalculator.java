package com.bptn.course._05_oop;

public class CafeCalculator {

	static double calculateItemRevenue (double pricePerItem, double numberOfItemsSold) {
		double itemRevenue = pricePerItem * numberOfItemsSold;
		
		return itemRevenue;
	}
	
	static double calculateDailyTotalRevenue (double coffeeRevenue, double pastryRevenue) {
		double dailyRevenue = coffeeRevenue * pastryRevenue;
		
		return dailyRevenue;
	}
	
    public static void main(String[] args) {

        // --- Step 1: Calculate revenue for each item type using our custom method ---
    	double coffeePrice = 2.50;
    	double coffeeSold = 45.00;
    	
    	double pastryPrice = 2.50;
    	double pastrySold = 75.00;
    	
    	double coffeeRevenue = calculateItemRevenue(coffeePrice, coffeeSold);
    	double pastryRevenue = calculateItemRevenue(pastryPrice, pastrySold);
    	
    	// --- Step 2: Calculate the total daily revenue using another custom method ---
    	double dailyRevenue = calculateDailyTotalRevenue(coffeeRevenue, pastryRevenue) ;
    	
    	// --- Step 3: Print out the results ---
    	System.out.println("Daily Coffee Revenue: $" + coffeeRevenue);
    	
    	System.out.println("Daily Pastry Revenue: $" + pastryRevenue);
        
    	System.out.println("Total Daily Revenue: $" + dailyRevenue);

    }
}