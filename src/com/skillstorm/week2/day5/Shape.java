package com.skillstorm.week2.day5;

// Something abstract like a shape is a prime candidate for being an abstract class

/*
 * Key Points:
 * 
 * 1. I cannot instantiate this class
 * 2. I can write logic in the class that each subclass will inherit
 * 3. I can choose to forego or "duck" the responsibility of implementing the method by making it abstract
 *    (Force that responsibility onto the child class)
 */

public abstract class Shape {

	private String color;
	
	// There's no way for me to have the knowledge of how to calculate the area of some random shape
	// BUT I do know that each shape will need that ability
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public abstract String getType();
}
