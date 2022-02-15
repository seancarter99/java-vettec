package com.skillstorm.week3.day1;

public class Food {
	
	// Stores nutritional info and general info on the food
	
	String name;
	int calories;
	
	// Default
	public Food() {
		// Sets name to null and calories to 0
	}
	
	// Full-arg taking in the two instance variables
	public Food(String name, int calories) {
		// Assign the parameters to the instance variables
		this.name = name;
		this.calories = calories;
		
	}

	public static void main(String[] args) {
		// Pizza
		//    name: "Pizza", calories: 500
		Food pizza = new Food("Pizza", 500);
		System.out.println("The food type is " + pizza.name + " and the calorie count is " + pizza.calories);
		
		// Salad
		//    name: "Salad", calories: 100
		Food salad = new Food("Salad", 100);
		// Changes pizza to
		// Pizza
		//    name: "Salad", calories: 500
		
		System.out.println("The food type is " + salad.name + " and the calorie count is " + salad.calories);
		
		System.out.println("The food type is " + pizza.name + " and the calorie count is " + pizza.calories);
		
	//	Food.name = "Burger";
		
		System.out.println("The food type is " + salad.name + " and the calorie count is " + salad.calories);
		
		System.out.println("The food type is " + pizza.name + " and the calorie count is " + pizza.calories);
		
		
		
		/*
		 * Biggest differences between Integer and int (Character and char, Boolean and boolean, etc.)
		 * 1. This is an object, not a primitive
		 * 2. Is it has access to methods on the object (intValue, toString, parseInt)
		 * 3. Has access to variables on it (MAX_VALUE, MIN_VALUE)
		 * 4. Integer is nullable. int is not
		 * 5. Is it is stored in the Heap, primitives are stored in the Stack
		 */
		
		// You can think of it as an int with the ability to be null
		Integer nonPrimitiveInt = 500;
		System.out.println(nonPrimitiveInt.intValue());
		
		int primitiveInt = 500;
	}

}
