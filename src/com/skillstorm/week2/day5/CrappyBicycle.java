package com.skillstorm.week2.day5;

// This Bicycle does NOT have the ability to stop
public class CrappyBicycle implements Driveable {

	@Override
	public void driveVehicle() {
		System.out.println("Driving my crappy bike!");
	}

	// I can still define my own brakeVehicle, but it's not enough to be considered a Brakeable object
	// To do that, I have to implement the interface explicitly
	public void brakeVehicle() {
		System.out.println("Braking my crappy bike!");
		// Instanceof
		Object o = 1;
		if (o instanceof String) {
			String myString = (String) o;
			myString.charAt(0);
		}
	}


}
