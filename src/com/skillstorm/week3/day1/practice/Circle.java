package com.skillstorm.week3.day1.practice;

public class Circle {
	
	// Declare attributes/properties for the class Circle
	String size;
	String color;
	float radius;
	// Create a Constructor for the class Circle w/out parameters (called the default no args Constructor)
	public Circle( ) {
		
		/*
		 * Set the initial values for the instance variables with the keyword 'this'
		 * followed by a period
		 */
		this.size = "red";
		this.color = null;
		this.radius = 0;
	}
	
	// Create (my own) Constructor for the class Circle with parameters
	public Circle(String size, String color, float radius) {		
	
		/*
		 *  use the keyword 'this' to set the parameters to the circle2 object
		'this' tells Java to look at the class rather than something else
		*/
		this.size = size;
		this.color = color;
		this.radius = radius;
	}
	
	// Calculate the Diameter (d) of a circle: d = (2 * radius)
	public double calcDiameter() {
		
		double diameter = (2 * radius);
		
		System.out.println("The diameter of this circle is: " + diameter + " meters");
		return diameter;
	}
	
	// Calculate the Circumference (C) of a circle: C = (2 * pi * radius)
	public double calcCircumference(){
		double circumference = (2 * Math.PI * radius);
		
		System.out.println("The circumference of this circle is: " + circumference +  " meters");
		return circumference;
	}
	//Calculate the Area (A) of a circle: A = (pi * r^2)
	public double calcArea() {
		
		double area = (Math.PI * Math.pow(radius, 2));
				
		System.out.println("The area of this circle is: " + area + " square units");
		return area;
	}
	
public static void main(String[] args) {
		
		// The syntax on the line below is what calls our (default) Circle constructor
		Circle circle = new Circle();
	
		System.out.println(circle.size);      		// should print null to the console
		System.out.println(circle.color);			// should print null to the console
		System.out.println(circle.radius);			// should print 0 to the console
		
		// This is what calls our (non-default) Circle constructor to create the circle
		Circle circle2 = new Circle("small", "green", 45);
		
		System.out.println(circle2.size + " " + circle2.color + " " + circle2.radius);
		//should print small green 45.0 to the console
		
		circle2.calcDiameter();
		
		circle2.calcCircumference();
		
		circle2.calcArea();		
	}
}