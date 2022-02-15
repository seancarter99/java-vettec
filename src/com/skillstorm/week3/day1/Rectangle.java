package com.skillstorm.week3.day1;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {
		this.length = 1.0;
		this.width = 2.0;
	}
	
	public Rectangle(double length, double width) {
		// If the length or width is <= 0, I know this is an invalid Rectangle
		if (length <= 0 || width <= 0) {
			throw new IllegalArgumentException("Length and width values must be a positive, non-zero number.");
		}
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		// This does nothing wrong, it's just that if we do the data protection right, this will never happen
//		if (length <= 0) {
//			throw new IllegalArgumentException("Length and width values must be a positive, non-zero number.");
//		}
		return this.length;
	}
	
	public void setLength(double length) {
		if (length <= 0) {
			throw new IllegalArgumentException("Length and width values must be a positive, non-zero number.");
		}
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Length and width values must be a positive, non-zero number.");
		}
		this.width = width;
	}
	
	public double getArea() {
		// This is not gonna behave properly if I have a negative or 0 length/width
		return this.length * this.width;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(1, 10000000);
		System.out.println("The area of the rectangle is: " + rectangle.getArea());
//		rectangle.setWidth(-1000); Throws exception in setter
		System.out.println("The area of the rectangle is: " + rectangle.getArea());
		rectangle.setWidth(110);
		
		Rectangle defaultRectangle = new Rectangle();
		System.out.println("The area of the rectangle is: " + defaultRectangle.getArea());
		
//		Exceptions.calcAreaOfRectangle(0, -20);
		
		try {
			Rectangle myRectangle = new Rectangle(10, 2);
			System.out.println("The area of the rectangle is: " + myRectangle.getArea());
			myRectangle.setLength(20);
			System.out.println("The area of the rectangle is: " + myRectangle.getArea());
		} catch (IllegalArgumentException e) {
			System.out.println("Something went wrong!");
		}
	}

}
