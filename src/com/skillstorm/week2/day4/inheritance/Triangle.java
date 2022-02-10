package com.skillstorm.week2.day4.inheritance;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height, String color) {
		// Since we are a child class, we need to call the parent constructor to initialize the other values
		super(3, 3, color); // We call the parent constructor using super() and pass it the arguments necessary
		// After the call to the parent class's constructor we will set the Triangle specific values
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Calculate the area
	public double getArea() {
		return calcArea();
	}

	private double calcArea() {
		return 0.5 * this.base * this.height;
	}
	
}
