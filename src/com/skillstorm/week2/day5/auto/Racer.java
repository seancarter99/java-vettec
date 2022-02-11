package com.skillstorm.week2.day5.auto;

/*
 * An abstract class is VERY similar to an interface
 * It's another form of abstraction, but has less limitations than an interface
 * 
 * Key Points:
 * 1. We can NOT instantiate an abstract class
 * 2. We CAN however have constructors in our abstract class (only able to be called by super())
 * 3. We can write function signatures like in an interface by adding abstract keyword to the front of it
 * 4. Any abstract function MUST be implemented by any inheriting child class
 * 5. We CAN write actual functions inside the abstract class (definitions and everything)
 * 
 * It sounds like abstract classes are just better interfaces
 * - In Java, classes can only inherit from one class, interfaces you can implement multiple
 */

// Final on a class means nothing can inherit from it and that'd be useless on an abstract class
public abstract class Racer {
	
	private float speed;
	
	public Racer() {
		
	}

	public Racer race(Racer otherRacer) {
		return null;
	}

	public float getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
}
