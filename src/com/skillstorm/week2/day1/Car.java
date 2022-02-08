package com.skillstorm.week2.day1;

public class Car {

	String model;
	String make;
	int year;
	String color;
	int numSeats;
	boolean isNew;
	int totalMileage = 0;
	
	public Car() {
		super(); // This calls the parent class's constructor (AKA Object)
		year = 2000;
		isNew = true;
	}
	
	public Car(String model, String make, int year, String color) {
		System.out.println("Constructor without boolean");
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.numSeats = 4;
		this.isNew = true;
	}
	
	public Car(String model, String make, int year, String color, int numSeats) {
		System.out.println("Constructor without boolean");
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.numSeats = numSeats;
		this.isNew = true;
	}
	
	public Car(String model, String make, int year, String color, int numSeats, boolean isNew) {
		System.out.println("Constructor with boolean");
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.numSeats = numSeats;
		this.isNew = isNew;
	}
	
	public void drive() {
		System.out.println("Inside no-arg drive method");
	}
	
	public void drive(int miles) {
		this.totalMileage += miles;
		if (this.totalMileage >= 1000) {
			this.isNew = false;
		}
		System.out.println("Driving " + miles + " miles!");
		
		System.out.println("The total mileage on the " + this.model + " is " + this.totalMileage + " miles!");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.isNew);
		Car modelT = new Car("Model-T", "Ford", 1908, "Black", 4);
		Car peanutButter = new Car("Model-T", "Ford", 1908, "Black", 4);
		System.out.println(modelT.color + " " + modelT.make);
		System.out.println("Is the car new? " + modelT.isNew);
		modelT.drive(50);
		System.out.println("Is the car still new? " + modelT.isNew);
		modelT.drive(1000);
		System.out.println("Is the car still new? " + modelT.isNew);
		peanutButter.drive();
		System.out.println(modelT); // Memory addresses
	}
}
