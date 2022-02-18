package com.skillstorm.week3.day4.animal;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Animal will be the parent class for all animals
 * 
 * In this class, we will define properties and abilities that all animals will have
 */

// We can NOT instantiate abstract classes. We CAN have method definitions and constructors though
public abstract class Animal {
	
	// What properties does an Animal have?
	
	// Private allows us to protect our data and limit what others can change it to
	private String color;
	private ArrayList<String> diet;
	
	public Animal() {
		this.diet = new ArrayList<>(); // Creates a non-null, empty ArrayList
	}
	
	public Animal(String color, ArrayList<String> diet) {
		if (diet == null) {
			throw new IllegalArgumentException("Diet must not be null");
		}
		this.color = color;
		this.diet = new ArrayList<>(diet);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		if (color == null) {
			throw new IllegalArgumentException("Color must not be null");
		}
		this.color = color;
	}
	
	public ArrayList<String> getDiet() {
		// This creates a copy of our ArrayList
		return new ArrayList<String>(this.diet);
	}
	
	// Each function to be considered "pure" should only have one job
	public void setDiet(ArrayList<String> diet) {
		if (diet == null) {
			throw new IllegalArgumentException("Diet must not be null");
		}
		this.diet = new ArrayList<>(diet);
	}
	
	public void addToDiet(String food) {
		this.diet.add(food);
	}
	
	public void eat(String food) {
		// What if diet is null?
		if (diet.contains(food)) {
			System.out.println("Nom nom nom");
		}
	}
	
	public void eat() {
		
	}
	
	public String toString() {
		return "The color of the animal is: " + this.color;
	}
	
	// Abstract methods have no definition. That's the subclass's problem
	public abstract void speak();
}
