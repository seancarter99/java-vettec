package com.skillstorm.week2.day4.inheritance;

public class Circle extends Shape {

	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius, String color) {
		super(0, 0, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return calcArea();
	}
	
	public double getCircumference() {
		return calcCircumference();
	}
	
	public double getDiameter() {
		return calcDiameter();
	}
	
	private double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	private double calcCircumference() {
		return Math.PI * calcDiameter();
	}
	
	private double calcDiameter() {
		return this.radius * 2;
	}
}
