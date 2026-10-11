package com.bptn.course._06_abstraction;

public class VehicleManager {
	
	public static void main(String[] args) {
		Car myCar = new Car("Honda", "Civic", 2023);
		
		System.out.println("---- CAR INFORMATION ----");
		myCar.displayBasicInfo();
		System.out.println();
		
		myCar.startEngine();
		System.out.println();
		
		myCar.drive();
		System.out.println();
		
		System.out.println(myCar.getFuelLevel());
		System.out.println();
		
		myCar.refuel(20.0);
		System.out.println();
		
		System.out.println(myCar.getFuelLevel());
		System.out.println();
		
		myCar.stopEngine();
		System.out.println();


		System.out.println("---- ELECTIRC BIKE INFORMATION ----");
		ElectricBike myBike = new ElectricBike("Trek", "E-Caliber", 2024);
		
		myBike.displayBasicInfo();
		System.out.println();
		
		myBike.startEngine();
		System.out.println();
		
		myBike.drive();
		System.out.println();
		
		System.out.println(myBike.getBatteryLevel());
		System.out.println();
		
		myBike.charge(25.0);
		System.out.println();
		
		System.out.println(myBike.getBatteryLevel());
		System.out.println();
		
		myBike.stopEngine();
		System.out.println();
		
		
		
		FuelConsuming fuelVehicle = myCar;
		
		fuelVehicle.refuel(45.0);
		System.out.println(fuelVehicle.getFuelLevel()); 
		
		
		
		ElectricPowered electricVehicle = myBike;
		electricVehicle.charge(55.0);
		System.out.println(electricVehicle.getBatteryLevel());
		
		
		
	}
	
}
