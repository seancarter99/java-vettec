package com.skillstorm.week1.day3;

public class Review {

	public static int calculateSum(int x, int y) { // sum
		int sum = x + y;
		return sum;
	}
	
	public static void main(String[] args) { // sum, num1, num2		
		int sum = calculateSum(1, 2);
		
		System.out.println("Sum returned from calculateSum(): " + sum);
		
		sum = sum + 10; // Adding a deposit
		
		System.out.println("Sum after deposit is made: " + sum);
		
		int num1 = calculateSum(4, 5);
		
		int num2 = calculateSum(2, 3);
		System.out.println(num1 - num2);
		
		
		
		
		
		System.out.println(sum);
	}

}
