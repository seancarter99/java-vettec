package com.skillstorm.week3.day2;

import com.skillstorm.week3.day1.Rectangle;

public class CallStack {

	public static int doubleNum(int num) {
		return num * 2;
	}
	
	public static int sayHello(String name) {
		int num = 3;
		System.out.println("Hello " + name + "!");
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		return doubleNum(i);
	}
	
	public static void editRectangle(Rectangle myRectangle) {
		myRectangle.setLength(20);
	}
	
	// I can say a function throws a runtime exception, but Java just ignores it
	public static int calcQuotient(int dividend, int divisor) throws ArithmeticException {
		int quotient = dividend / divisor;
		return quotient;
	}
	
	public static int returnsQuotient(int dividend, int divisor) {
		return calcQuotient(dividend, divisor);
	}
	
	public static void handleDivideByZero() {
//		try {
//			int q = returnsQuotient(2, 0);
//			System.out.println(q);
//		} catch (ArithmeticException e) {
//			System.out.println("An error occurred");
//		}
		returnsQuotient(2, 0);
	}
	
	public static void main(String[] args) {
		/*
		 * In Java there's a thing known as the call stack
		 * 
		 * What the call stack is, is layers of our application and the order at which Java processes them
		 */
//		try {
//			int quotient = calcQuotient(5, 0);
//			System.out.println(quotient);
//		} catch (ArithmeticException e) {
//			String name = "joe";
//			System.out.println(name);
//		}
		handleDivideByZero();
//		calcQuotient(5, 0);
//		int num = 5;
//		String name = "Sean";
//		boolean knowsJava = true;
		
		
		
		
//		Rectangle rectangle = new Rectangle(10, 20);
//		System.out.println("The rectangle's area is: " + rectangle.getArea());
//		
//		editRectangle(rectangle);
//		
//		System.out.println("The rectangle's area is: " + rectangle.getArea());
//		
//		rectangle = null;
//		int index = sayHello(name);
//		
//		index = doubleNum(index);
		System.out.println("Reached end");
	}

}
