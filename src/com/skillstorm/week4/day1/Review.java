package com.skillstorm.week4.day1;

public class Review {
	
	public static String multiply(int x, int y, String word) {

//		System.out.println(x * y);
		
		// It takes a String and attempts to turn it into an integer
		
		int parsedInt = Integer.parseInt(word);
		
		
		return "The answer is: " + (x * y);
		
		
	}
	
	public static void main(String[] args) {
		
		String ans1 = multiply(2, 3, "sheep");
		String ans2 = multiply(4, 4, "453");
		
		System.out.println(ans1);
		System.out.println(ans2);
//		
//		String word = "apple";
//		System.out.println(word);
//		
//		word = "bee";
//		System.out.println(word);
		
		
		
		
		
		
		
//		
//		multiply("word to your mother");
//		multiply("");
//		multiply(word);
	}
}
