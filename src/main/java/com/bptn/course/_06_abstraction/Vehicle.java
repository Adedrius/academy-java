package com.bptn.course._06_abstraction;

public abstract class Vehicle {
	
    protected String make;
    protected String model;
    protected int year;
    protected boolean isEngineOn = false;
    
    public Vehicle (String make, String model, int year) {
    	this.make = make;
    	this.model = model;
    	this.year = year;
    }
    
    public void displayBasicInfo() {
    	System.out.println("Make: " + make);
    	System.out.println("Model: " + model);
    	System.out.println("Year: " + year);
    }
    
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();
    
}

