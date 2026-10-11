package com.bptn.course._07_inheritance;

public class Car extends Vehicle {

	   //instance variable 
	   String steeringWheel;

	   //add parameterized constructor- use super keyword to call parent constructor
	   public Car(String colour, String brand, String steeringWheel) {
		   super(colour, brand);
		   this.steeringWheel = steeringWheel;
	   }
	   
	   public void print() {
		   super.print();
	   }
}
