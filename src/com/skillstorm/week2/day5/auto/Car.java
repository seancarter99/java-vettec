package com.skillstorm.week2.day5.auto;

// What does a car need to do, to be a car?
public class Car implements Driveable {

	@Override
	public void drive() {
		System.out.println("Driving my car!");
	}

	@Override
	public void brake() {
		System.out.println("Braking my car!");
	}	
}
