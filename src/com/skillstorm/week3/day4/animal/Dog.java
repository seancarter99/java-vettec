package com.skillstorm.week3.day4.animal;

import java.util.ArrayList;

public class Dog extends Animal {
	
	private String color;

	public Dog() {}
	
	public Dog(String color) {
		super("Red", new ArrayList<>());
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println("Bark! Bark!");
	}
	
	// We're overriding the default behavior of simply printing the memory address
	// Instead, we print "I am a Dog!"
	@Override
	public String toString() {
//		return super.toString(); // Prints Animal's version of color
		return "I am a " + this.color + " Dog!";
	}
	
	public String getColor() {
		return this.color;
	}

}
