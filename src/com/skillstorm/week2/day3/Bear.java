package com.skillstorm.week2.day3;

public class Bear {

	// Step 1
	int numTeeth;
	double footSize;
	String furColor;
	String size;
	String favoriteFood;
	// List of child bear cubs
	// The bear's favorite food
	// The bear's favorite name
	
	// Step 2
	public Bear(int numTeeth, double footSize, String furColor, String size, String favoriteFood) {
		System.out.println("This bear will be created with " + numTeeth + " teeth");
		System.out.println("This bear will be created with " + footSize + " feet as a foot size");
		System.out.println("This bear will be created with " + furColor + " fur");
		System.out.println("This bear will be created as a " + size + " bear");
		// Setting the parameters to the bear object
		this.numTeeth = numTeeth;
		this.footSize = footSize;
		this.furColor = furColor;
		this.size = size;
		this.favoriteFood = favoriteFood;
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// This is what creates our bear
		// More specifically, this is what calls our Bear constructor to create the bear
		Bear yogi = new Bear(20, 20.5, "brown", "huge", "Picnic Baskets"); // Inside these parentheses this is how you pass info to create our bear
		Bear winnie = new Bear(10, 4, "yellow", "medium", "Honey");
		System.out.println("Yogi's favorite food is: " + yogi.favoriteFood);
		System.out.println("Winnie's favorite food is: " + winnie.favoriteFood);
	}
}
