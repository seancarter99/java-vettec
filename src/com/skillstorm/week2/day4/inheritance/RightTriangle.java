package com.skillstorm.week2.day4.inheritance;

// No other class can extend from RightTriangle
public final class RightTriangle extends Triangle {

	public RightTriangle() {
		
	}
	
	public RightTriangle(double base, double height, String color) {
		super(base, height, color);
	}
	
	public double getHypotenuse() {
		return calcHypotenuse();
	}
	
	private double calcHypotenuse() {
		double aSquared = Math.pow(this.getHeight(), 2);
		double bSquared = Math.pow(this.getBase(), 2);
		return Math.sqrt(aSquared + bSquared);
	}
}
