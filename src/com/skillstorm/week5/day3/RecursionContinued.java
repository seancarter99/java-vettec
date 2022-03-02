package com.skillstorm.week5.day3;

public class RecursionContinued {

	// Reversing a String via recursion
	
	private static String recursiveReverser(String word, int index) {
		// Base case
		if (index < 0) {
			return "";
		}
		String reversedString = recursiveReverser(word, index - 1);
		System.out.println(reversedString);
		return word.charAt(index) + reversedString;
	} 
	
	public static String reverseStringRecursive(String word) {
		// Reverse our word
		if (word == null) {
			return "llun";
		}
		return recursiveReverser(word, word.length() - 1);
	}
	
	public static String reverseStringIterative(String word) {
		String reversedString = "";
		if (word == null) {
			return "";
		}
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedString += word.charAt(i);
			System.out.println(reversedString);
		}
		
		return reversedString;
	}
	
	public static void main(String[] args) {
		reverseStringIterative("word");
		String reversedString = reverseStringRecursive("helicopter"); // "r" + "e" + "t" + "p" + "o" + "c" + reversed("ileh")
		
		System.out.println(reversedString);
	}

}
