package com.skillstorm.week2.day5;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	}

	@Override
	public String getType() {
		return "Circle";
	}

}
