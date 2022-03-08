package com.skillstorm.week6.day1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Pineapple", "Strawberry", "Mango", "Coconut", 
				"Raspberry", "Orange", "Blueberry", "Cherry", "Blackberry"));
		
		
		/*
		 * Different stream functions (Hint: Think of streams as lists)
		 * 
		 * All of the following functions do NOT mutate the original data set
		 * 
		 * forEach - Takes a stream and performs a lambda expression on each element of the stream. It does not return a new stream
		 * 
		 * map - Takes a stream and performs a lambda expression on each element of the stream, but it must return a value and uses that
		 *       value to construct a new stream
		 * 
		 * filter - Takes a stream and performs a lambda expression on each element of the stream. That lambda will return true/false
		 *          Where false represents that element shouldn't be added to the new stream and true will add to the new stream
		 * 
		 * reduce - Takes a stream and performs a lambda expression on each element, it adds the return to an accumulated value.
		 *          Think of it like a snowball rolling down a hill. The accumulated value gets bigger with each iteration
		 */
		
		// To use forEach, I need a stream
		// I can get a stream using fruits.stream(). That turns my list into a stream
		
		Stream<String> fruitStream = fruits.stream();
		
		
		// Lambda that, for each fruit in the list, prints the fruit
		fruitStream.forEach(fruit -> System.out.println(fruit));
		
		fruits.stream().map(fruit -> "Apple").forEach(fruit -> System.out.println(fruit));
		
		// I want to map over all of my fruits and capitalize them
		
		// collect is a function that collects all the data in the stream and does something with it
		// We give collect the function, Collectors.toList() as a way to "provide a lambda" for transforming our stream back to a list
		List<String> capitalizedFruits = fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
		System.out.println(capitalizedFruits);
		
		System.out.println(fruits);
		
		int[] nums = {1, 2, 3, 4 ,5};
		
		// This is almost the same as map, but is longer to type/read and also changes the original array nums
		// map would create a brand new array instead
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			nums[i] = num * 2;
		}
		
		// This is functionally forEach
		for (int num : nums) {
			System.out.println(num);
		}
		
		// Filter
		
		// Filter example: Getting fruits that start with a b
		List<String> fruitsThatBeginWithB = fruits.stream().filter(fruit -> fruit.toLowerCase().charAt(0) == 'b').collect(Collectors.toList());
		System.out.println(fruitsThatBeginWithB);
		
		// Filter example: Getting fruits that have the word berry in it
		List<String> berries = fruits
				.stream()
				.filter(fruit -> fruit.toLowerCase().contains("berry"))
				.collect(Collectors.toList());
		
		System.out.println(berries);
		
		// Reduce
		
		// Reduce is useful for adding up all of a list, finding the max of a list
		// Any operation that takes a list and boils to a singular value is good to use with reduce
		
		List<Integer> numbers = new LinkedList<>(Arrays.asList(5, 22, 3, 10, 7, 12));
		
		// First parameter is my start value
		// Second is my lambda
		// That lambda takes two parameters, the accumulated value so far and the current element in the list
		
		/*
		 * This function does this step by step
		 * 
		 * 1. Takes our Integer List and turns it to a Stream of Integers
		 * 2. We then call reduce on that Stream
		 * 3. We set the initial value of acc (accumulator) to be 0
		 * 4. We define our lambda that takes a accumulator and the current number we're looking at and return the  new accumulator
		 * 5. Finish looping through all numbers, then return the end acc value
		 */
		int sumOfNumbers = numbers
				.stream()
				.reduce(0, (acc, number) -> acc + number);
		System.out.println(sumOfNumbers);
		
		// Reduce example: Finding the max of our number list
		
		int maxOfNumbers = numbers
				.stream()
				.reduce(Integer.MIN_VALUE, (max, number) -> {
					int newMax = Math.max(max, number);
					return newMax;
					// if (max < number) {return number} else {return max}
					// return (max < number) ? number : max;
				});
		
		int otherMax = numbers.stream().reduce(Integer.MIN_VALUE, (max, number) -> Math.max(max, number));
		
		System.out.println(maxOfNumbers);
	}

}
