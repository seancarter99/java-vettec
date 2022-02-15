package com.skillstorm.week2.day5.auto;

// Driver as in where my program starts, NOT a car driver
public class Driver {
	
	/*
	 * If you wanna use this function, don't give it or a null or you're gonna break your program
	 */
	public static void driveVehicle(Driveable vehicle) {
		if (vehicle == null) {
			return;
		}
		vehicle.drive();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		driveVehicle(car);
		driveVehicle(null);
		
		RaceCar racer = new RaceCar(); // Cannot instantiate an abstract class
		
		Driveable dr = new Car();
	}

}
