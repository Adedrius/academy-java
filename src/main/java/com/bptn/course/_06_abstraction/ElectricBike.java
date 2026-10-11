package com.bptn.course._06_abstraction;

public class ElectricBike extends Vehicle implements ElectricPowered {
	
	private double batteryLevel = 75.0;

	public ElectricBike(String make, String model, int year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge(double kWh) {
		// TODO Auto-generated method stub
		this.batteryLevel = this.batteryLevel + kWh;
		System.out.println("Charging...battery is now at " + this.batteryLevel);
	}

	@Override
	public double getBatteryLevel() {
		// TODO Auto-generated method stub
		System.out.println("Retrieving current battery level...");
		return this.batteryLevel;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting the engine...");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Stopping the engine...");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving the electric bike...");
	}
	
	
    
}
