package com.skillstorm.week5.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

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
//		actOnArray(nums, num -> System.out.println("The number is " + num));
//		actOnArray(nums, num -> System.out.println("The number doubled is " + (num * 2)));
		
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
		
//		Stream<String> stream = fruits.stream().map(fruit -> { return "Map: " + fruit; });
//		stream.forEach(fruit -> System.out.println(fruit));
//		fruits.stream().forEach(fruit -> System.out.println("forEach: " + fruit));
		
		LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(numbers);
		
		numbers.stream().forEach(number -> {
			System.out.println(number * 2);
		});
		
		Stream<Integer> doubledNumbers = numbers.stream().map(number -> {
			return number * 2;
		});
		
		/*
		 * (num, coefficient) -> {
		 *    return num / coefficient;
		 * }
		 */
		
		int[] myNums = {1, 3, 5, 7, 9};
		// for each number in the array, run this function
		forEach(myNums, (num, coefficient) -> {
			System.out.println(num * coefficient);
		});
		
		// Same thing, no lambda
		for (int i = 0; i < nums.length; i++) {
			calcProduct(nums[i], 2);
		}
		
		// for each that calculates subtraction
		forEach(myNums, (num, otherNum) -> {
			System.out.println(num - otherNum);
		});
		
		// for each that mods the nums
		forEach(myNums, (num, modAmount) -> {
			System.out.println(num % modAmount);
		});
//		FruitComparator fc = new FruitComparator();
		Collections.sort(fruits, (fruit1, fruit2) -> {
			return fruit2.length() - fruit1.length();
		});
		System.out.println(fruits);
	}
	
	public static void forEach(int[] nums, Operation op) {
		for (int i = 0; i < nums.length; i++) {
			op.performOperation(nums[i], 2);
		}
	}
	
	
	
	
	
	
	
	
	public static int calcSum(int number, int anotherNumber) {
		return number + anotherNumber;
	}
	
	public static int calcProduct(int number, int anotherNumber) {
		return number * anotherNumber;
	}

	public static int calcQuotient(int dividend, int divisor) {
		return dividend / divisor;
	}
}

class FruitComparator implements Comparator<String> {

	@Override
	public int compare(String fruit1, String fruit2) {
		// TODO Auto-generated method stub
		return fruit1.length() - fruit2.length();
	}
	
}

interface Operation {
	void performOperation(int num, int coefficient);
}
