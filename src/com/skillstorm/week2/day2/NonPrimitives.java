package com.skillstorm.week2.day2;

public class NonPrimitives {
	
	int num;
	String name;
	
	public NonPrimitives(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public static String upperCaseString(String msg) {
		if (msg == null) { // Accounts for null strings
			return null;
		}
		return msg.toUpperCase();
	}

	public static void main(String[] args) {
		/*
		 * Primitive Data Types:
		 * - int
		 * - double
		 * - float
		 * - char
		 * - boolean
		 * - etc.
		 * 
		 * Non-Primitive Data Types (Objects):
		 * - String
		 * - Arrays
		 * - Classes
		 * - Interfaces
		 * 
		 * Characteristics of non-primitives:
		 * - Nullable
		 * - A pointer to somewhere else in memory (memory address)
		 * - They can point to the same place in memory
		 * 
		 * The reason we can null non-primitives is because we're essentially saying the memory address is not there
		 */
		
		int[] nums = new int[5]; // Arrays are technically Objects
		System.out.println(nums.length);
		
		NonPrimitives np1 = new NonPrimitives(10, "Harold");
		System.out.println("Value of np1 is: " + np1.num);
		NonPrimitives np2 = np1; // np2 is now the memory address of np1
		np2.num = 20;
		np2.name = "Jerry";
		System.out.println("Value of np2 is: " + np2.name);
		System.out.println("Value of np1 is: " + np1.name);
		System.out.println(nums);
		System.out.println(np1);
		System.out.println(np2);
		
		/*
		 * Java utilizes a feature known as a String pool
		 * Since Strings are immutable in Java, we can have them point to the same String without worry of it changing
		 * 
		 * String pool exists to save space
		 */
		
		String applePie1 = "Apple Pie";
		String applePie2 = new String("Apple Pie");
		
		// == Is it checks the logical equality (do the two strings match), but it's also comparing the memory addresses
		// Comparing a new String() with a "" String with == fails because the memory addresses are not the same
		
		System.out.println("Do the two strings equal one another? " + (applePie1 == applePie2));
		char c1 = 'A';
		char c2 = 'A';
		System.out.println("Do these two chars equal one another? " + (c1 == c2));
		
		// We use String's .equals in order to compare JUST the logical equality (do the strings match)
		// Works with .equals()
		System.out.println("Do the two strings equal one another? " + (applePie1.equals(applePie2)));
		
		applePie2 = "Blueberry Pie";
		NonPrimitives np3 = null;
//		System.out.println(np3.num); // null pointer exception
		
		/*
		 * Null checking
		 * Anything that can be nulled, we can assume will be nulled
		 * 
		 * That's an edge case for us to account for
		 * 
		 * null DOT anything will throw a null pointer exception
		 */
		
		String output = upperCaseString(null); // Returns null because of if statement
		System.out.println(output);
		
		applePie1 = null;
		// Before doing .equals on a String, you should check to ensure the left one is not null
		if (applePie2 != null) {
			// Only run this code if applePie2 is NOT null
			System.out.println("Do the two strings equal one another? " + (applePie2.equals(applePie1)));
		}
		
		
		// Let's I wanted to store my int as a null
//		int i = null; // Not allowed because int is a primitive and therefore is non-nullable
		
		/*
		 * "Wrapper class"
		 * 
		 * A wrapper class is a class that takes some primitive value and stores it in a object for us
		 * Usually comes some utilities built in
		 * 
		 * Examples of Java's Wrapper Classes:
		 * 
		 * - Integer
		 * - Character
		 * - Boolean
		 * - Double
		 * - Float
		 * - Byte
		 * - Short
		 * - Long
		 */
		Integer i = 20;
		
		Boolean b = null;
		char c = 'a';
		System.out.println(c);
	}

}
