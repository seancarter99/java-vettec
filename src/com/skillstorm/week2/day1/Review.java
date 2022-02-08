package com.skillstorm.week2.day1;

public class Review {
	
	int age = 10;
	
	public static boolean isEven(int num) {
		int x;
		if (true) {
			x = 15;
		}
		System.out.println(x);
		return num % 2 == 0;
	}
	
	public static int calcSum(int x, int y) {
		return x + y;
	}
	
	static void printName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	public static boolean canVote(int age) {
		return true;
	}
	
	
	
	
	static void myFunction() {
		int myVariable = 5;
	}
	

	public static void main(String[] args) {
	
		int myVariable = 10;
		System.out.println(myVariable);
		
		
		
		
		
		int[] nums = new int[3]; // 0 -> 1 -> 2
		
		/*
		 * A conditional statement that if the statement is true, we run the block of code.
		 * Once the block finishes, the conditional statement is reevaluated and if it's true it runs the block.
		 * Rinse and repeat.
		 * 
		 * If at any point the conditional statement is false, we don't run the block, and instead move on with
		 * the program
		 */
		
		// Starting at 0 and going until count is no longer less than 5, add 1 to count and print it out
		int count = 0;
		while (count < 5) {
			count++;
			System.out.println(count);
		}
		
		int bankBalance = 5000;
		while (bankBalance > 0) {
			System.out.println("Paying rent: Minus $1000");
			bankBalance = bankBalance - 1000;
			System.out.println("Your current balance is: $" + bankBalance);
		} // current bankBalance: 0000
		
		System.out.println("Out of money!");
		
//		canVote(-500);
//		int i = 0;
//		System.out.println(5 / 2); // 5 / 2 -> 2.5 -> 2
//		System.out.println((int) Math.ceil(5 / 2));
		
		
		double number = 99.99999999999;
		System.out.println(number);
		
		String nickName = "Johnny";
		String favoriteColor = "Blue";
		printName("Sally", "Doe");
//		System.out.println(firstName + " " + lastName);
		System.out.println(calcSum(2, 4));
		
//		System.out.println("5" + "5");
//		String number = "5" + 5;
//		int age = 2;
//		if (age >= 21) {
//			System.out.println("You are an adult");
//		} else {
//			System.out.println("You are not an adult");
//		}
//		
//		// Arrays are 0-indexed
//		int[] nums = new int[5];
//		String[] fruits = {"apple", "blueberry", "coconut"};
//		
//		System.out.println(fruits);
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
//		
//		nums[3] = 30;
//		nums[4] = 20;
//		System.out.println(nums);
//		
//		for (int num : nums) {
//			System.out.println(num);
//		}
//		
//		String[] emptyBoolArr = new String[5];
//		
//		for (String bool : emptyBoolArr) {
//			System.out.println(bool);
//		}
//		
//		String csv = "John,Doe,2";
//		String[] parsedCsv = csv.split(",");
//		
//		int ageFromCsv = Integer.parseInt(parsedCsv[2]);
//		System.out.println(ageFromCsv);
	}

}
