package com.skillstorm.week2.day5;

public class Triangle extends Shape {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}

	@Override
	public String getType() {
		return "Triangle";
	}

	@Override
	public String toString() {
		return "Triangle with base (" + this.base + ") and height (" + this.height + ")";
	}
}
