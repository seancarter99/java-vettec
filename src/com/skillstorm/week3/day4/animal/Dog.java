package com.skillstorm.week3.day4.animal;

public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Bark! Bark!");
	}
	
	// We're overriding the default behavior of simply printing the memory address
	// Instead, we print "I am a Dog!"
	@Override
	public String toString() {
		return "I am a Dog!";
	}

}
