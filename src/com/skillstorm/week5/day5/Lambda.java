package com.skillstorm.week5.day5;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import com.skillstorm.week4.day4.City;

public class Lambda {
	
	// This is what passing a function to another would look like
//	public static void doStuff(Function someFunction, int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int doubledNum = someFunction(arr[i]);
//		}
//	}
	
	public static int doubleNum(int num) {
		return num * 2;
	}
	
	public static int halfNum(int num) {
		return num / 2;
	}

	public static void main(String[] args) {
		/*
		 * What is a Lambda?
		 * - In Java 8, the ability to use lambda functions was added
		 * - They were added to support the growing coding paradigm known as "functional programming"
		 * - Lambdas provide a means to pass a "function" to another function
		 * 
		 * Lambdas are often referred to as:
		 * 1. Lambdas
		 * 2. Anonymous Functions (because they have no name)
		 * 3. Arrow Functions
		 * 
		 * Functional Programming:
		 * 1. Functions are first class citizens
		 *    - I can pass functions to other functions
		 *    - I can returns functions
		 *    - In Java, I cannot pass functions to functions nor return functions
		 * 2. Believe in a concept known as "pure functions"
		 *    - This means, no function should have any "side effects"
		 *    - Side effects being any behavior that isn't part of the functions primary purpose
		 *      - Mutating (changing) the value of a parameter
		 *      - Calculating some other value
		 *    - Each function should have one purpose and stick to that
		 *    
		 * 
		 * Functional Programming in Java is completely opt in. Java is OOP at its core
		 *    
		 */
//		int[] nums = {1, 2, 3};
//		doStuff(doubleNum, nums);
//		doStuff(halfNum, nums);
		
		LinkedList<City> cities = new LinkedList<>();
		cities.add(new City("Jacksonville", 900000));
		cities.add(new City("Miami", 400000));
		cities.add(new City("Houston", 1200000));
		cities.add(new City("New York", 7500000));
		cities.add(new City("Charlotte", 950000));
		cities.add(new City("Boston", 700000));
		cities.add(new City("Atlanta", 1400000));
		cities.add(new City("Seattle", 1300000));
		
		// Use Lambdas to sort my list
		// Using Lambdas, I can define the actual compare method by itself and pass that in to Collections.sort
	
		System.out.println(cities);
		Collections.sort(cities, new CityPopulationComparator());
		System.out.println("Sorting by city population");
		System.out.println(cities);
		
		// This uses a lambda function to go ahead and sort my cities by name
		System.out.println("Sorting cities by name");
		Collections.sort(cities, (city1, city2) -> city1.getName().compareTo(city2.getName()) );
		
		System.out.println(cities);
		
		// In essence, I've put my lambda into a variable
		
		Comparator<City> cityNameReverseSorter = (city1, city2) -> {
			if (city1 == null) {
				if (city2 == null) {
					return 0;
				}
				return 1;
			}
			if (city1.getName() == null) {
				if (city2.getName() == null) {
					return 0;
				}
				return 1;
			}
			
			return city2.getName().compareTo(city1.getName());
		};
		
		cities.sort(cityNameReverseSorter);
		
		System.out.println(cities);
		
		/*
		 * Lambda function syntax rules
		 * 
		 * General Structure
		 * 
		 * No argument, hello world function
		 * () -> System.out.println("Hello World!");
		 * 
		 * () - The parentheses are where my arguments (or lack thereof) for the function go. There is no data type for them
		 * -> - The arrow symbolizes the start of the function body
		 * ALl else - The code run by the function. The function ends at the first semicolon
		 * 
		 * The way that function's written, I can only have one line in that function
		 * 
		 * More complex example
		 * 
		 * (city1, city2) -> {
		 *    return city1.getPopulation() - city2.getPopulation();
		 * }
		 * 
		 * - For this examples, I have two parameters both in the ()
		 * - The {} symbolize the actual body of my lambda
		 * - When I want multiple lines in my lambda, I need the {}
		 * - I am also required to use "return" when using {}
		 */
		
		/*
		 * Valid examples of lambdas
		 * 
		 * This function takes no arguments and returns 1
		 * 1. () -> 1;
		 * 
		 *    Non-Lambda equivalent
		 *    public static int someFunction() {
		 *    	return 1;
		 *    }
		 * 
		 * 2. () -> { return 1; }
		 * 
		 * If and only if you have one argument, you can omit the ()
		 * This function takes a parameter called num and returns num
		 * 3. num -> num;
		 * 
		 *    public static int someFunction(int num) {
		 *    	return num;
		 *    } 
		 *    
		 * 4. (num) -> num;
		 * 
		 * 5. (num1, num2) -> {return num1 + num2}
		 * 
		 * Invalid examples
		 * 
		 * Lambdas with {}, if you're trying to return, you MUST type return explicitly
		 * 1. () -> { 1; }
		 * 
		 * Without the {}, it must be all done on one line
		 * 2. (num1, num2) -> System.out.println(num1); System.out.println(num2);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Invalid (need () when 0, 2+ args)
		 *  -> "Hello World";
		 *  
		 *  Invalid (need ())
		 *  e1, e2 -> e1 + e2;
		 *  
		 *  Invalid (need to return)
		 *  (str1, str2) -> { str1 + str2; }
		 *  
		 *  Valid
		 *  word -> word.charAt(0);
		 *  
		 *  Valid
		 *  () -> System.out.println("Hello");
		 */
	}

}
