package com.skillstorm.week3.day4.animal;

public class Pig extends Animal {

	@Override
	public void speak() {
		System.out.println("Oink! Oink!");
	}
	
	@Override
	public String toString() {
		return "I am a Pig!";
	}

}
