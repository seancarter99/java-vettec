package com.skillstorm.week6.day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LambdaReview {

	public static void main(String[] args) {
		LinkedList<String> words = new LinkedList<>();
		
		words.add("Bacon");
		words.add("Apple");
		words.add("Ostrich");
		words.add("Mountain");
		words.add("Be");
		words.add("Xylophone");
		
		System.out.println(words);
		
		Collections.sort(words, new StringLengthComparator());
		
		System.out.println(words);
		
		Collections.sort(words, (o1, o2) -> {
			if (o1 == null) {
				if (o2 == null) {
					return 0;
				}
				return 1; // Non-Null element comes first, null goes to the end
			}
			else if (o2 == null) {
				return -1; // Since o1 is not null, but o2 is, o1 should come first
			}
			return o1.length() - o2.length(); // Actual sort implementation
		});
		
		System.out.println(words);
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.length() - o1.length();
	}
	
}