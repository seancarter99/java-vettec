package com.skillstorm.week5.day2;

import java.util.HashSet;

public class Review {

	public static void main(String[] args) {
		Movie starWars = new Movie("Star Wars", "George Lucas");
		Movie godfather = new Movie("The Godfather", "Francis Ford Copola");
		Movie gameOfThrones = new Movie("Game Of Thrones", "George R.R. Martin");
		Movie batman = new Movie("Batman", "Matt Reeves");
		Movie batman2 = new Movie("Batman", "Matt Reeves");
		
		HashSet<Movie> movieCollection = new HashSet<>();
		
		movieCollection.add(new Movie("Snow White", "Walt Disney"));
		movieCollection.add(starWars);
		movieCollection.add(godfather);
		movieCollection.add(batman);
		movieCollection.add(batman2);
		
		System.out.println("Star Wars: " + starWars.hashCode());
		System.out.println("The Godfather: " + godfather.hashCode());
		System.out.println("Batman: " + batman.hashCode());
		System.out.println("Batman 2: " + batman2.hashCode());

		
		System.out.println(movieCollection);
		
		movieCollection.remove(batman2);
		
		/*
		 * Data Structure is just a term used to define some structure that holds data
		 * 
		 * Each data structure holds data in its own unique way
		 * 
		 * Stacks - Add to top, remove from top
		 * Queues - Add to back, remove from front
		 * Lists - Keep data orderly in a list-like format
		 * Sets - Prevent duplicates
		 * Maps - Store Key-Value pairs
		 */
		
		/*
		 * HashSet is an "unordered" collection
		 * 
		 * Ordered maintains its "insertion" order
		 * - The place at which is what inserted
		 * 
		 * Sorted collections like PriorityQueues
		 * - Use natural ordering (compare, compareTo) to determine where to place an item in the collection
		 * 
		 * HashSets place items not using their natural ordering, they use hash codes to determine "order"
		 */
		
		/*
		 * HashSets are Sets which mean NO duplicates
		 */
		
		/*
		 * HashSet pros:
		 * 1. Close to constant time lookup times (with a good hash algorithm)
		 * 2. More spread out in terms of space
		 * 
		 */
	}

}
