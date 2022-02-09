package com.skillstorm.week2.day3;

public class Rectangle {
	
	// Instance variables go here
	// Individual properties of our Rectangle
	
	// All variables should be private by default
	private double length;
	private double width;
	// Double width would default to null
	// double width defaults to 0.0
	
	// We want these to be constant, because they're the same for EVERY rectangle that exists
	// These variables are public since they can't be changed anyways
	public static final double INTERIOR_ANGLE = 90;
	public static final double SUM_OF_INTERIOR_ANGLES = 360;
	
	// Default constructor. Initialize my rectangle with a width of 2 and a length of 3
	public Rectangle() {
//		this(2.0, 3.0); // Calls sibling constructor. Forwarding the duties to another constructor
		this.length = 2.0;
		this.width = 3.0;
	}
	
	public Rectangle(double length) {
		this.length = length;
		this.width = length; // Makes it a square since they only provided one dimension
	}
	
	public Rectangle(double l, double w) {
		length = l; // Don't need to use this when there's no variable name conflict
		width = w;
	}
	
	// Standard naming for getters is to take the variable, uppercase the first letter and add "get" to the front
	public double getLength() {
		// All the getter does is it returns the variable associated with it.
		return this.length;
	}
	
	// If there's no setter, then I can't modify the variable
	
	// Standard naming for setters is to make the variable uppercase, but add "set" to the front
	public void setLength(double newLength) { // Setters are void, and they also take in a parameter
		this.length = newLength;
	}
	
	// width -> getWidth
	// bestFriend -> getBestFriend()
	// numberOfCowsOnGrandmasFarm -> getNumberOfCowsOnGrandmasFarm()
	public double getWidth() {
		return width;
	}
	
	// This function ONLY changes the width
	public void setWidth(double width) {
		// We can do logic in here
		if (width < 0) {
			width = 0;
		}
		this.width = width; // If provided width is negative, set to 0 instead
	}
	
	// This function ONLY reads the area by calculating it
	// Think of this as a "nice to have" utility
	public double getArea() {
		double area = this.length * this.width;
		return area;
	}
	
	public double getPerimeter() {
		return (2 * this.length) + (2 * this.width);
	}
	
	// I would NOT write a setArea	
	// If you want to change the area, do so by changing the length or the width
//	public void setArea(double area) {
//		// Changing area means that one or both of length and width have changed
//		double sideLength = Math.sqrt(area);
//		this.length = sideLength;
//		this.width = sideLength;
//	}

	private void printHello() {
		System.out.println("Hello!" + this.length);
	}

	public static void main(String[] args) {
		/*
		 * What is encapsulation?
		 * 
		 * It is the process of protecting our data and masking it behind "getters" and "setters".
		 * It allows us more control over what data is allowed to be accessed and modified.
		 * 
		 * Getters are windows into our class's internal operations in order to read data
		 * Setters are windows that allow us to modify a piece of data in a class. We can limit what's allowed
		 * 
		 * To make an attribute secure, we can make the field private
		 * 
		 * public - Publicly accessible from anywhere. (Inside the class AND outside the class)
		 * 
		 * private - Means it is only accessible from within the class itself
		 */
		
		Rectangle rectangle = new Rectangle();
		Rectangle rectangleWithDimensions = new Rectangle(5.0, 10.0);
		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
		rectangleWithDimensions.length = 10.0;
		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
//		rectangle.printHello();
	}

}
