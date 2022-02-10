package com.skillstorm.week2.day4;

public class Color {

	short redVal;
	short greenVal;
	short blueVal;
	
	public Color(short red, short green, short blue) {
		redVal = red;
		greenVal = green;
		blueVal = blue;
	}
	
	public static void main(String[] args) {
		short red = 150;
		short green = 20;
		short blue = 245;
		Color color = new Color(red, green, blue);
	}
}
