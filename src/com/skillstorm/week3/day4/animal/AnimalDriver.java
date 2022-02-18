package com.skillstorm.week3.day4.animal;

import java.util.ArrayList;

public class AnimalDriver {

	public static void main(String[] args) {
		// Polymorphism allows me to fit multiple different types of objects in here so long as they're animals
		ArrayList<Animal> barn = new ArrayList<>();
		
		barn.add(new Pig());
		barn.add(new Dog());
		barn.add(new Pig());
		barn.add(new Cat());
		barn.add(new Penguin());
		barn.add(new Dog());
		barn.add(new Cow());
		barn.add(new Cat());
		barn.add(new Dog());
		barn.add(new Penguin());
		barn.add(new Cow());
		barn.add(new Cat());
		barn.add(new Cow());
		
		barn.set(0, new Cat());
		// Runtime polymorphism allows me to call the method of the specific animal while in the program
		// Let Java deduce which method it is that it should call (ie. pigs go oink, cows go moo)
		for (Animal animal : barn) {
			// Depending on the animal being "looked at" by Java on a given round of the loop, Java calls its specific speak method
			animal.speak();
			System.out.println(animal);
		}

//		barn.get(0).speak();
//		barn.get(1).speak();
//		barn.get(2).speak();
		
		System.out.println(barn);
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Gary");
		names.add("Sally");
		
		String[] otherNames = {"Gary", "Sally"};
		
		System.out.println("ArrayList names: " + names);
		System.out.println("Standard array names: " + otherNames);
		
		ArrayList<String> newDiet = new ArrayList<>();
		Pig myAnimal = new Pig();
		myAnimal.setDiet(newDiet);
		System.out.println(myAnimal.getDiet());
		newDiet.add("Apples");
		newDiet.add("Carrots");
		System.out.println(myAnimal.getDiet());
		myAnimal.setDiet(newDiet);
		System.out.println(myAnimal.getDiet());
		myAnimal.addToDiet("Slop");
		System.out.println(myAnimal.getDiet());
		
		
		Dog fido = new Dog("Blue");
		System.out.println(fido.toString());
	}

}
