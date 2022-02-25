package com.skillstorm.week4.day5.equalsPractice;

public class Flower {

	private String type; // rose, daisy, chrysanthemum
	private String color; // red, blue, orange
	private double length;
	
	public Flower() {
		
	}
	
	public Flower(String type, String color, double length) {
		this.type = type;
		this.color = color;
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "[" + this.type + ", " + this.color + ", " + this.length + "]";
	}

	// With this function, I want to determine if two objects are equal to one another

	@Override
	public boolean equals(Object that) {
		// I want to determine if they're the exact same spot in memory
		// This part is already done with Object's version of equals
		if (this == that) {
			// We return true since we're the exact same data in memory
			return true;
		}
		// If the other object "that" is null, then it can't be the same as this
		if (that == null) {
			// "this" cannot be null
			return false;
		}
		// Now I need to check what class "that" is. Right now it's an Object which could be anything
		// I need to see if it's a flower
		
		// This checks to see if I can convert that into a Flower object
		// If I can't, then that is not a Flower and therefore not equal to my flower
		if (!(that instanceof Flower)) {
			// The other object is not a flower
			return false;
		}
		
		// Since here I know that "that" is a flower, I can freely cast it to be one
		Flower otherFlower = (Flower) that; // If that wasn't a Flower, then a ClassCastException would be thrown
		
		// Finally down here, I have two flowers that I can compare
		
		// If the two flowers' types are not equal, return false
		if (!this.type.equals(otherFlower.type)) {
			return false;
		}
		
		// Now I want the colors to the be the same to be considered "equal"
		if (!this.color.equals(otherFlower.color)) {
			return false;
		}
		
		if (this.length != otherFlower.length) {
			return false;
		}
		// All checks passed, they are the same!
		return true;
		
		// This is how you could all at the same time instead of all the if statements
//		return this.color.equals(otherFlower.color) 
//				&& this.type.equals(otherFlower.type)
//				&& this.length == otherFlower.length;
	}

	
	

	// Java's version of equals. Generate this
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Flower other = (Flower) obj;
//		return Objects.equals(color, other.color)
//				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
//				&& Objects.equals(type, other.type);
//	}
	
	public static void main(String[] args) {
		Flower rose = new Flower("Rose", "Pink", 8.6);
		Flower anotherRose = new Flower("Rose", "Pink", 8.6);
		Flower daffodil = new Flower("Daffodil", "Yellow", 5.5);
		Flower tigerLilly = new Flower("Tiger Lilly", "Orange", 7.6);
		
		System.out.println(rose);
		System.out.println(anotherRose);
		System.out.println(tigerLilly);
		
		// Let's say I want my flowers to be considered "equal" if they're the same type
		System.out.println("Are these two flowers equal? " + rose.equals(anotherRose));
		
		System.out.println("Is rose a flower? " + (rose instanceof Flower));
		System.out.println("Is rose an object? " + (rose instanceof Object));
		
		System.out.println(rose.getColor());
		
		// == definition does not get changed by equals overridding
		System.out.println(rose == anotherRose);
	}
}
