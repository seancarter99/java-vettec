package com.skillstorm.week2.day4.inheritance;

public class Driver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(15, 76.3, "blue");
		System.out.println("Triangle's color: " + triangle.getColor());
		
		System.out.println("Triangle's area: " + triangle.getArea());
		
		Circle circle = new Circle(25.5, "magenta");
		
		System.out.println("Circle's area: " + circle.getArea());
		System.out.println("Circle's circumference: " + circle.getCircumference());
		System.out.println("Circle's diameter: " + circle.getDiameter());
		
		RightTriangle rightTriangle = new RightTriangle(20, 7.9, "purple");
		
		System.out.println("Right Triangle's Hypotenuse: " + rightTriangle.getHypotenuse());
		System.out.println("Right Triangle's Area: " + rightTriangle.getArea());
		System.out.println("Right Triangle's Number of Sides: " + rightTriangle.getNumSides());
		
		/*
		 * Reminder for access modifiers through inheritance
		 * 
		 * public - Publicly accessible
		 * private - Is only available within the class itself
		 * protected - Is only available in the class, in a subclass, or in the same package
		 */
	}

}
