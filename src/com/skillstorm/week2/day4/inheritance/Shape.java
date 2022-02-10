package com.skillstorm.week2.day4.inheritance;

public class Shape {
	
	// Step 1: What properties does a Shape have?
	private int numSides;
	private int numAngles;
	private String color;
	
	// Step 2: How do I create a shape?
	public Shape() {
		// This implicitly calling Object's constructor
	}
	
	public Shape(int numSides, int numAngles, String color) {
		this.numSides = numSides;
		this.numAngles = numAngles;
		this.color = color;
	}
	
	public int getNumSides() {
		return this.numSides;
	}
	
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	public int getNumAngles() {
		return this.numAngles;
	}
	
	public void setNumAngles(int numAngles) {
		this.numAngles = numAngles;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
