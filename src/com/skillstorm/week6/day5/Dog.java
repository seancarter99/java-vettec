package com.skillstorm.week6.day5;

public class Dog {

	private String name;
	private String breed;
	private Owner owner;
	
	public Dog() {}

	public Dog(String name, String breed, Owner owner) {
		this.name = name;
		this.breed = breed;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	// I want the ability to feed my dog food
	// I want to give my dog food and have him eat it
	public void feed(Food food) {
		System.out.println("Hello my name is " + this.name);
		System.out.println("I am going to eat " + food.getName());
	}
	
	public static void main(String[] arsg) {
		Dog dog = new Dog("Henry", "Golden Retriever", null);
		Food chickenLiver = new Food("Chicken Liver");
		
		dog.feed(chickenLiver);
		
		Owner sean = new Owner("Sean", dog);
		Owner sharita = new Owner("Sharita", null);
		
		System.out.println("The dog's owner is: " + dog.getOwner().getName());
		
		sean.transferOwnership(sharita);

		System.out.println("The dog's owner is: " + dog.getOwner().getName());
		
		System.out.println("Sean's dog is: " + sean.getPet());
		System.out.println("Sharita's dog is: " + sharita.getPet().getName());
	}
}
