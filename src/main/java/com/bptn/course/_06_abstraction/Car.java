package com.bptn.course._06_abstraction;

public class Car extends Vehicle implements FuelConsuming {
	
	 private double fuelLevel = 50.0;
	
	 public Car(String make, String model, int year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	 @Override
	 public void refuel(double liters) {
		// TODO Auto-generated method stub
		this.fuelLevel = this.fuelLevel + liters;
		System.out.println("Refueling...Gas is now at " + this.fuelLevel);
	 }

	 @Override
	 public double getFuelLevel() {
		// TODO Auto-generated method stub
		System.out.println("Getting current fuel level...");
		return this.fuelLevel;
	 }

	 @Override
	 public void startEngine() {
		// TODO Auto-generated method stub
		 isEngineOn = true;
		 System.out.println("Starting the engine...");
	 }

	 @Override
	 public void stopEngine() {
		// TODO Auto-generated method stub
		 isEngineOn = false;
		 System.out.println("Stopping the engine...");
	 }

	 @Override
	 public void drive() {
		// TODO Auto-generated method stub
		 System.out.println("Driving the fuel-consuming car...");
	 }
	 
	 
}
