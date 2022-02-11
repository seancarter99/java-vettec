package com.skillstorm.week2.day4;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal dolphin = new Animal("Gray", "Fish", 15, "Flipper");
		dolphin.speak();
		Animal lion = new Animal("Yellow", "Zebras", 8, "Simba");
		lion.speak();
		lion.eatOtherAnimal(dolphin);
		
		HouseCat tabby = new HouseCat("Brown", "Fish", 4, "Max", "Tabby", "Peter");
		tabby.speak(); // This works because it was inherited by Animal
		
		// So this defaultCat uses the default constructor of each of its parent classes
		HouseCat defaultCat = new HouseCat();
		
		// When we print an object, Java calls its toString method, if not defined, it uses Object's
		System.out.println();
		System.out.println(lion); // this automatically calls toString
		System.out.println(tabby.toString()); // Same thing as without toString
		
		// Anything that IS an Animal can go in the Animal array
		Animal[] zoo = new Animal[10];
		zoo[0] = dolphin;
		zoo[1] = tabby;
		zoo[2] = defaultCat;
		
		HouseCat[] cats = new HouseCat[2];
		cats[0] = tabby;
		cats[1] = defaultCat;
		
		for (HouseCat cat : cats) {
			
		}
		
		System.out.println(dolphin);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Setting animal at index " + i);
			zoo[i] = new Animal("Green", "Fish", 10, "Mittens");
		}
		
		int count = 0;
		for (Animal animal : zoo) {
			System.out.println("Animal at index " + count);
			System.out.println(animal);
			count++;
		}
		
		int[] nums = {1, 2, 3};
		
		System.out.println(nums[0]);
		nums[0] = 2;
		System.out.println(nums[0]);
	}

}
