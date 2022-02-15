package com.skillstorm.week2.day5;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Circle";
	}

}
