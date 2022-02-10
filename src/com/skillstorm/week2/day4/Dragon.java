package com.skillstorm.week2.day4;

public class Dragon {

	private int age;
	private int intelligence;
	private int defense;
	private int strength;
	private boolean hasWings;
	
	public Dragon() {
		
	}
	
	public Dragon(int age, int intelligence, int defense, int strength, boolean hasWings) {
		// The constructor should initialize the values of our dragon for use
		this.age = age;
		this.intelligence = intelligence;
		this.defense = defense;
		this.strength = strength;
		this.hasWings = hasWings;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	
	public boolean hasMagic() {
		/*
		 * 100+ years old it has magic
		 * Anything else they have fangs
		 */
		return this.age >= 100;
	}
	
	public boolean hasFangs() {
		return !hasMagic(); // Determine if the dragon has magic, and return the opposite
	}

	@Override
	public String toString() {
		return "Dragon age: " + this.age + "\nDragon intelligence: " + this.intelligence
				+ "\nDragon Defense: " + this.defense + "\nDragon Strength: " + this.strength
				+ "\nDragon Wings: " + this.hasWings + "\nDragon Magic: " + hasMagic() 
				+ "\nDragon Fangs: " + hasFangs();
	}
	
	public static void main(String[] args) {
		Dragon dragon = new Dragon(99, 115, 80, 65, true);
		System.out.println(dragon);
		
		Dragon babyDragon = new Dragon(10, 80, 50, 43, false);
		System.out.println();
		System.out.println(babyDragon);
		
		System.out.println();
		dragon.setAge(100);
		System.out.println(dragon);
	}

}
