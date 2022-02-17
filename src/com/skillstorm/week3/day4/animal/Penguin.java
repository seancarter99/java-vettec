package com.skillstorm.week3.day4.animal;

import java.util.ArrayList;

public class Penguin extends Animal {

	public Penguin() {
		
	}
	
	public Penguin(String color, ArrayList<String> diet) {
		super(color, diet);
	}
	
	// We must provide a definition for speak() to inherit from Animal
	@Override
	public void speak() {
		System.out.println("Squawk! Squawk!");
	}
	
	@Override
	public String toString() {
		return "I am a Penguin!";
	}
	
	public static void main(String[] args) {
		ArrayList<String> diet = new ArrayList<>();
		diet.add("Fish");
		System.out.println(diet);
		Penguin p = new Penguin("Black", diet);
		
		diet.add("Cheeseburgers");
		
		System.out.println(p.getDiet());
		
		System.out.println("Penguin's diet is: " + p.getDiet());
		
		// This gets a copy of the penguin's diet
		ArrayList<String> penguinsDiet = p.getDiet();
		penguinsDiet.add("Seaweed");
		// Changing this doesn't actually change the diet in our Penguin object
		
//		p.setDiet(penguinsDiet); // We don't change penguin's diet unless we use setter
		// We changed the diet without using the setter
		System.out.println("Penguin's diet is: " + p.getDiet());
		
	}

}
