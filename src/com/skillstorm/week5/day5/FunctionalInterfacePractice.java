package com.skillstorm.week5.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FunctionalInterfacePractice {

	public static void actOnArray(int[] nums, Action action) {
		for (int i = 0; i < nums.length; i++) {
			// In here, I don't know what "act" does, but I know it takes an int and doesn't return anything
			action.act(nums[i]);
		}
		System.out.println("Kaboom!");
	}
	
	public static void main(String[] args) {
		
		// Down here, I'll define what action I will perform on each element of the array
		int[] nums = {1, 2, 3, 4, 5};
		
//		FunctionalInterfacePractice fip = new FunctionalInterfacePractice();
//		actOnArray(nums, fip);
		
		// I'm passing as the second argument, an implementation for "act"
//		Action action = num -> System.out.println("Inside lambda expression " + num)
		actOnArray(nums, num -> System.out.println("The number is " + num));
		actOnArray(nums, num -> System.out.println("The number doubled is " + (num * 2)));
		
		// Java has some prebuilt methods for us
		
		/*
		 * Most functional languages have some, if not all or more of these capabilities
		 * 
		 * NONE of these methods mutate the original data
		 * 
		 * forEach - Takes a function and performs that function on every element in the stream. Does not create a new stream
		 * map - Takes a function and performs that function on every element in the stream.
		 *       Map takes the return of that function and creates a new stream consisting of the value returned at each index
		 * reduce - Takes a function and uses it to "condense" our stream into a singular value
		 *          You can use it as a "sum up"
		 * filter - Takes a function that returns a boolean and uses it to create a new stream only containing values that returned true
		 * 
		 * To use these, we need to create a "stream" object
		 * Think of a "stream" as a list
		 * 
		 */
		
		ArrayList<String> fruits = new ArrayList<>(
				Arrays.asList("Strawberry", "Apple", "Banana", "Mango", "Pineapple", "Apple", "Blueberry", "Blackberry", "Raspberry"));
		
		// forEach
		Stream<String> fruitStream = fruits.stream();
		
		// I give forEach a function to perform on each fruit in the fruitStream
		// Closes the stream after completion
		fruitStream.forEach(fruit -> {
			System.out.println("My fruit is: " + fruit);
		});

		// map
		Stream<String> alteredFruitStream = fruits.stream().map( (fruit) -> "Apple" );
		System.out.println("Stream after map function:\n");
		alteredFruitStream.forEach(fruit -> {
			System.out.println("My fruit is: " + fruit);
		});

		// I can rewrite this to chain together my streams
		/*
		 * 1. Take my list fruits and turn it into a stream
		 * 2. Map each fruit in the stream to be an upper case version of itself and return it as a stream
		 * 3. Use that returned stream by map to print the fruits
		 */
		
		fruits.stream().map(fruit -> fruit.toUpperCase()).forEach(fruit -> System.out.println(fruit));
	}

}
