package com.skillstorm.week7.day1;

public abstract class Shape {

	public Shape() {
		
	}
	
	public Shape(String word) {
		System.out.println(word);
	}
	
	public abstract double getArea();
	
	public double getPerimeter() {
		return 0.0;
	}
	
	public static void main(String[] args) {
//		Shape shape = new Shape(); // Not allowed
		Square square = new Square("Hello World!");
	}
}

class Square extends Shape {
	public Square() {
		
	}
	
	public Square(String word) {
		super(word);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}