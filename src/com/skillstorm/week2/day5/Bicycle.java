package com.skillstorm.week2.day5;

// In order to use our interface, we can use the implements keyword to "inherit" from it
public class Bicycle implements Driveable, Brakeable {
	
	private float tirePressure;
	private String color;
	private String make;
	private String owner;
	
	public float getTirePressure() {
		return tirePressure;
	}

	public void setTirePressure(float tirePressure) {
		this.tirePressure = tirePressure;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	// Overriding is just a child class providing its own details for a parent class or interface's function
	@Override
	public void driveVehicle() {
		System.out.println("Driving my " + this.color + " bike!");
	}

	@Override
	public void brakeVehicle() {
		System.out.println("Braking my bike!");
	}
}

/*
 * Static variables and methods are shared between ALL instances of the class and even the class itself
 * Non-static variables and methods are UNIQUE to that specific instance of a class or object
 */