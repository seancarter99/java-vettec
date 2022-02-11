package com.skillstorm.week2.day5;

import com.skillstorm.week2.day4.Animal;

public class Review {

	public static void main(String[] args) {
		Animal bear = new Animal("Brown", "Picnic Baskets", -20, null);
		bear.setName("Yogi");
		String bearName = bear.getName();
		System.out.println("Bear's name is: " + bearName);
		System.out.println("Bear's age is: " + bear.getAge());
		if (bearName != null) {
			System.out.println("Bear's uppercased name is: " + bearName.toUpperCase());
		} else {
			System.out.println("The bear has no name");
		}
		// You can pass null to anything that requires a non-primitive
		bear.eatOtherAnimal(null);
		bear.eatOtherAnimal(new Animal("White", "Penguins", 40, "Coca-Cola Bear"));
	}

}
