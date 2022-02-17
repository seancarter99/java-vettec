package com.skillstorm.week3.day4.animal;

public class Cow extends Animal {

	@Override
	public void speak() {
		System.out.println("Moo!");
	}
	
	@Override
	public String toString() {
		return "I am a Cow!";
	}

}
