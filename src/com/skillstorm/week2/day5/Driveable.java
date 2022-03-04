package com.skillstorm.week2.day5;

// Interfaces have a similar structure to classes, but are very different

/*
 * Abstraction: Masking the underlying details of our code behind a simple and easy to use window (interface)
 * 
 * Key points for an interface
 * 
 * 1. We can NOT instantiate an interface as we do a class
 * 2. We can NOT have a constructor in our interface
 * 3. An interface can only define method signatures (NO Logic/code block)
 * 4. We can define public static final constants in here (regular variables will be turned into constants)
 * 5. All methods MUST be public
 * 
 * Pros for interface:
 * 1. Interfaces are lightweight "contracts" for a class
 * 2. Interfaces are used in conjunction with classes to ensure that the class MUST have these properties
 * 3. Implementing an interfaces, forces the class to define those methods
 * 4. Classes can only extend from ONE parent class, but they can implement from MANY interfaces
 */
@FunctionalInterface
public interface Driveable {

	public void driveVehicle(); // I will write the signature for my method, but nothing else
	
	public static void sayHello() {
		System.out.println("Hello!");
	}
	
	public static final int NUM = 5; // We can define our constant variables here
}
