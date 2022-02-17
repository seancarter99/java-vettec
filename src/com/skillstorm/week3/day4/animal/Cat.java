package com.skillstorm.week3.day4.animal;

public class Cat extends Animal {

	@Override
	public void speak() {
		System.out.println("Meow! Meow!");
	}
	
	@Override
	public String toString() {
		return "I am a Cat!";
	}
}
