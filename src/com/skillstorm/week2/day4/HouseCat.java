package com.skillstorm.week2.day4;

public final class HouseCat extends Feline {
	
	// Even though it's not listed, HouseCat still has a breed, a color, an age.
	// It has these because it's defined in the parent class, thus, it is inherited
	private String owner;
	
	public HouseCat() {
		super(); // Think of this as a function, and it'll execute that "function" before returning to this spot
		System.out.println("Inside HouseCat constructor");
	}
	
	public HouseCat(String color, String favoriteFood, int age, String name, String breed, String owner) {
//		this.name = name; // Doesn't work because name is private and only accessible from within Animal
//		this.setName(name); // Works, but there's a better way of doing it
//		super(); // Calls the no-arg parent constructor
		super(color, favoriteFood, age, name, breed);
		this.owner = owner;
	}
	
	public void printName() {
		System.out.println(this.getName());
	}
	
	// Cannot override due to the final descriptor on the Feline's speak method
//	public void speak() {
//		
//	}
}
