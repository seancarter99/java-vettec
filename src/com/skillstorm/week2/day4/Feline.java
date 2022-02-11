package com.skillstorm.week2.day4;

/*
 * There are three uses for final
 * 
 * 1. To prevent a variable from being reassigned a value
 * 2. Adding final to a function to prevent it from being overridden
 * 3. Adding final to a class definition to prevent any class from inheriting from it
 */

// The syntax for inheriting from a parent class
//           Child          Parent
public class Feline extends Animal {

	// Here is where we define properties specific to a cat
	private String breed;
	
	public Feline() {
		// The very first line of a constructor if we don't add it is super();
		super(); // It calls the parent constructor that matches these arguments
		System.out.println("Inside Feline constructor");
	}
	
	public Feline(String color, String favoriteFood, int age, String name, String breed) {
		super(color, favoriteFood, age, name); // Just keep them passing them up
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	/*
	 * With inheritance, we inherit all of the functionality of our parents
	 * We can if we want, override any of the behavior set by the parent
	 */
	// This overrides the parent's speak function since they're called the exact same (Same parameters, same name)
	
	// This annotation is not necessary, but it's use is strongly encouraged
	@Override
	public final void speak() {
		System.out.println("I am a feline named " + this.getName());
		// Just because I overrode the definition of Animal's speak, doesn't mean it's not there
		// I can access it using super
		super.speak(); // This calls the parent's version of speak
	}
	
	/*
	 * Inheritance
	 * 
	 * The biggest thing for inheritance is copying (or inheriting) logic from a parent class
	 * 
	 * The child can do everything the parent can do and possibly more
	 * 
	 * Parent Class
	 *   - Is the step above the child
	 *   - A parent class is to a child class as a rectangle is to a square
	 * 
	 * Child Class
	 *  - It is the step below the parent and can do everything it can do
	 *  
	 *  When inheriting, the child will attempt to use the closest definition of the function, unless it itself
	 *  overrides the function
	 *  
	 *  Access modifiers
	 *  - public
	 *  - private
	 *  - protected
	 */
}
