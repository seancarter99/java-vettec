package com.skillstorm.week6.day5;

// Is a functional interface
/*
 * To be considered a functional interface, the interface must have 1 and ONLY 1 abstract method
 * Abstract methods are just functions with no body {}
 */
@FunctionalInterface
interface Action {
	void act(int num);
}

public class LambdaReview {

	public static void performActionOnTheNumber100(Action action) {
		action.act(100);
	}
	
	public static void main(String[] args) {
		/*
		 * In order to use Lambdas in Java, a functional interface is required
		 * 
		 * Lambdas forego the requirement of creating a class that satisfies the interface
		 * Because these functional interfaces only have one method to implement, I can just define a function instead
		 */
		// I'm setting actionImplementation to a function that represents the act method
		
		// () -> 5
		// () - The function parameters
		// -> - The indication of the function body
		// 5 -> The value being returned
		
		Action actionImplementation = (num) -> {
			System.out.println("Inside the lambda function");
			System.out.println("The number provided is: " + num);
		};
		
		Action numberDoubler = (num) -> {
			System.out.println("The number doubled is: " + (num * 2));
		};
		
		DoSomething doubleNum = new DoSomething();
//		performActionOnTheNumber100(doubleNum);
		performActionOnTheNumber100(actionImplementation);
		
		actionImplementation.act(325);
		
		System.out.println();
		numberDoubler.act(25);
		
		performActionOnTheNumber100((num) -> {
			System.out.println("The number orignially was: " + num);
			System.out.println("The number divided by 50 is: " + (num / 50));
		});
	}
}