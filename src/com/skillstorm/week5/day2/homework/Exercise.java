package com.skillstorm.week5.day2.homework;

import java.util.HashMap;

public class Exercise {

	/*
	 * Find the number of times each character appears in a given string
	 */
	public static HashMap<Character, Integer> countCharacters(String word) {
		// TODO Return a HashMap containing the number of times each character appeared in the word
		Character c = word.charAt(0);
		return null;
	}
	
	// Bonus Challenge
	/*
	 * Find the amount of times each word appears in a given string array
	 */
	public static HashMap<String, Integer> countWords(String[] sentence) {
		// TODO Return a HashMap containing the number of times each word appeared in the sentence
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(countCharacters("dog")); // d -> 1, o -> 1, g -> 1
		System.out.println(countCharacters("racecar")); // r -> 2, a -> 2, c -> 2, e -> 1
		
		// Bonus challenge
		String[] sentence1 = {"Sally", "sells", "sea", "shells", "by", "the", "sea", "shore"};
		String[] sentence2 = {"How", "much", "wood", "could", "a", "woodchuck", "chuck", "if", "a", "woodchuck", "could", "chuck", "wood"};
		
		// Sally -> 1, sells -> 1, sea -> 2, shells -> 1, by -> 1, the -> 1, shore -> 1
		System.out.println(countWords(sentence1));
		
		// How -> 1, much -> 1, wood -> 2, could -> 2, a -> 2, woodchuck -> 2, chuck -> 2, if -> 1
	}

}
