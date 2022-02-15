package com.skillstorm.week3.day1;

public class Review {

	static int num;
	String name;
	
	public Review(int num) {
		this.num = num;
	}
	
	public static void printHello() {
		System.out.println("Hello!");
	}
	
	public void printWorld() {
		System.out.println("World!" + " " + this.name);
	}
	
	public static void main(String[] args) {
		/*
		 * Key things for static:
		 * 1. Static functions can only call other static functions
		 * 2. Static fields belong to the class and are shared between ALL instances of a class
		 * 3. Non-static property are unique and specific for the individual object
		 * 4. When a field is non-static, an object is required to call it
		 */
		
		printHello();
		
		Review r1 = new Review(2);
		System.out.println("R1's value is: " + r1.num);
		Review r2 = new Review(13);
		
		System.out.println("R2's value is: " + r2.num);
		System.out.println("R1's value is: " + r1.num);
		
		Review.num = -50;
		
		System.out.println("R1's value is: " + r1.num);
		System.out.println("R2's value is: " + r2.num);
		
		r2.name = "Fred";
		
		r2.printWorld();
		r1.printWorld();
	}

}
