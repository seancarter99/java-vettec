package com.skillstorm.week2.day3;

// File that works with Squares
public class Driver {

	public static void main(String[] args) {
		// Don't need to import Square when in the same package
		Rectangle square = new Rectangle();
//		System.out.println(square.num); // Doesn't work because it's a private variable
//		Square.printHello(); // Also doesn't work when private
		
		
		Rectangle rectangle = new Rectangle();
		Rectangle rectangleWithDimensions = new Rectangle(5.0, 10.0);
		
		// When they're private, I cannot read nor write to the variables
//		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
//		rectangleWithDimensions.length = 10.0;
//		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
		
		System.out.println("Rectangle's length: " + rectangleWithDimensions.getLength());
		
		// Changing this length does NOT change the value of my rectangle's length
		double length = rectangleWithDimensions.getLength();
		length++; // Add 1
		length *= 2; // Double
//		rectangleWithDimensions.length = 10.0; // Use the setter instead
		rectangleWithDimensions.setLength(10.0);
		System.out.println("Rectangle's length: " + rectangleWithDimensions.getLength());
		
		System.out.println("Rectangle's area: " + rectangleWithDimensions.getArea());
		rectangleWithDimensions.setWidth(1.0);
		System.out.println("Rectangle's area: " + rectangleWithDimensions.getArea()); // Changes area
		
		double area = rectangleWithDimensions.getArea();
		// double perimeter = (2 * rectangleWithDimensions.getLength()) + (2 * rectangleWithDimensions.getWidth());
		double perimeter = rectangleWithDimensions.getPerimeter();
		System.out.println(perimeter);
		
		System.out.println(Rectangle.SUM_OF_INTERIOR_ANGLES);
		System.out.println(Rectangle.INTERIOR_ANGLE);
	}

}
