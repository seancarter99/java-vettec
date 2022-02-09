package com.skillstorm.week2.day2;

public class Dog {

	// Instance variables AKA properties of a dog
	String size;
	int numLegs;
	String owner;
	String color;
	String breed;
	
	public Dog() {
		
	}
	
	public Dog(String size, int numLegs, String owner, String color, String breed) {
		// "this" could mean goldenRetriever, pitbull, or any other Dog I create
		this.size = size;
		this.numLegs = numLegs;
		this.owner = owner;
		this.color = color;
		this.breed = breed;
	}
	
	// If I call the function with husky.printOwner(). this.owner will essentially be husky.owner
	// goldenRetriever.printOwner will print the goldenRetriever's owner
	public void printOwner() {
		System.out.println("My owner is: " + this.owner);
	}
	
	public static void main(String[] args) {
		Dog husky = new Dog("Large", 4, "Sean", "White", "Husky");
		
		// Husky is a container storing a size, owner, color, breed, etc.
		
		husky.printOwner();
		// I want to make a dog
		Dog goldenRetriever = new Dog(); // This works because of the default constructor
		System.out.println("The golden's owner is: " + goldenRetriever.owner);
		
		goldenRetriever.owner = "Sharita"; // Sets the instance variable owner to "Sharita"
		goldenRetriever.color = "Golden";
		goldenRetriever.size = "Large";
		
		System.out.println("The golden's owner is: " + goldenRetriever.owner);
		System.out.println("The golden's color is: " + goldenRetriever.color);
		System.out.println("The golden's size is: " + goldenRetriever.size);
		
		Dog pitbull = new Dog();
		pitbull.owner = "Sean";
		pitbull.color = "Brown"; // Constructor helps us avoid this
		pitbull.size = "Small";
		pitbull.breed = "Pitbull";
		
		pitbull.printOwner();
		
	}

}
