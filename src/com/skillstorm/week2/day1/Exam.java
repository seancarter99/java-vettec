package com.skillstorm.week2.day1;

public class Exam {

	public static void sayWorld() {
	    System.out.println("World!");
	}
	   
	public static void saySomething(String msg) {
		System.out.println(msg);
      	sayWorld();
	}
	
	public static int add(String x, String y) {
		return 0;
	}
	
	public static int add(int x, int y) {
		System.out.println("Add with 2 ints");
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		System.out.println("Add with 3 ints");
		return x + y + z;
	}
	
	public static void main(String[] args) {
//		saySomething("Hi");
//		sayWorld();
//		System.out.println("Goodbye.");
//		
//		System.out.println("PI as a double: " + Math.PI);
//		System.out.println("PI as a float: " + (float) Math.PI);
		String[] bands = {"The Beatles", "Pink Floyd", "Queen", "The Kinks"};
		for (int i = 0; i < bands.length; i++) {
		   System.out.println(bands[i]);
		}
		
		System.out.println(add(2, 2));
		System.out.println(add(5, 10, 5));
	}
	
}
