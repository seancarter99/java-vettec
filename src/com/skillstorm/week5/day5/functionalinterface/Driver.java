package com.skillstorm.week5.day5.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	public static void findNumberGivenCriteria(FindBiggest<Integer> fb) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		Integer num1 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter number: ");
		Integer num2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter number: ");
		Integer num3 = scan.nextInt();
		scan.nextLine();

		System.out.println(fb.compare(num1, num2, num3));
	}

	public static void main(String[] args) {
		FindBiggestInteger fbi = new FindBiggestInteger();
		//		findBiggestNumber(fbi);
//		findNumberGivenCriteria((num1, num2, num3) -> {
//			// I'm looking for the smallest number of all three numbers
//			if (num1 < num2) {
//				if (num1 < num3) {
//					return num1;
//				}
//				else {
//					return num3;
//				}
//			}
//			else {
//				if (num2 < num3) {
//					return num2;
//				}
//				else {
//					return num3;
//				}
//			}
//		});
//		
		FindBiggest<Integer> sumUp = (num1, num2, num3) -> {
			return num1 + num2 + num3;
		};
		
		findNumberGivenCriteria(sumUp);
		
		LinkedList<String> words = new LinkedList<>(Arrays.asList("Turtle", "A", "Bee", "Be", "To", "Two", "Those", "Supercalifragiclisticexmialodiocius", "Aardvark"));
		Collections.sort(words); // Sorts by alphabetical
		System.out.println(words);
		
		// To sort by string length
		Collections.sort(words, (word1, word2) -> {
			return word1.length() - word2.length();
		});
		System.out.println("Word list after sorting by length");
		System.out.println(words);
		Collections.sort(words, (word1, word2) -> word2.length() - word1.length());
		System.out.println(words);
	}

}
