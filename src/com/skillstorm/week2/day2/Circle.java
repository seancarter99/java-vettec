package com.skillstorm.week2.day2;

import com.skillstorm.week2.day3.Rectangle;

public class Circle {

	/*
	 * Create a class, Circle, that describes and performs the capabilities of a real-life circle. 
	 * These circles should store pertinent data and be able to perform operations such as calculating 
	 * the diameter, circumference, and area.
	 * 
	 * Requirements:
	 * 
	 * - Contains useful methods calculating a circle's diameter, circumference, and area
	 * 
	 * - You should be able to create a Circle by providing a radius, or, if none is provided, 
	 *   creates a circle with some default radius instead
	 *   
	 * - You should be able to have multiple Circle objects each with their own independent sizes
	 * 
	 * Bonus Challenge:
	 * 
	 * - Create a method that compares two Circles and determines if they are equal to one another
	 */
	
	// Instance variables. These are the properties of the Circles that we create
	String size;
	String color;
	
	// The primary purpose of a constructor is to initialize the instance variables
	public Circle(String size, String color) {
		this.size = size;
		this.color = color;
		System.out.println(this.size + " " + this.color);
	}
	
	public static void myFunction(String size, String color) {
		System.out.println(size + " " + color);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		String size = "large";
		String color = "red";
		Circle cir1 = new Circle(size, color);
		System.out.println(cir1.size + " " + cir1.color);
		
		int x = 2;
		int y = 4;
		add(y, x);
		
		Rectangle square = new Rectangle();
//		square.printHello();
	}

}
