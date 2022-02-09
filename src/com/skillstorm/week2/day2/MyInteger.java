package com.skillstorm.week2.day2;

public class MyInteger {

	int num;
	
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483648;
	
	
	public MyInteger(int num) {
		this.num = num;
	}
	
	public static int calcSum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Takes the value on the right and assigns to the value on the left
		// It evaluates everything on the right before assigning it
		// = is our Assignment Operator
		int num = 5;
		int sum = calcSum(2, 3);
		
		/*
		 * == is our Logical Equals Operator
		 * 
		 * It takes the value on the left and compares it with the value on the right
		 * if they are equal, it returns true
		 * if they are not equal, it returns false
		 */
		int x = 5;
		System.out.println(x = calcSum(5, 10));
		System.out.println("The value of x is: " + x);
		x++; // x = x + 1 or x += 1
		x--; // x = x - 1 or x -= 1
		x = x + 5; 
		x += 1; // x = x + 1
		x = x - 5;
		x -= 5; // x = x - 5
		
		x *= 5; // x = x * 5;
		x /= 5; // x = x / 5;
		x %= 5; // x = x % 5;
		System.out.println(x);
	}

}
