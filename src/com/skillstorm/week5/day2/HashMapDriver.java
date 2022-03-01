package com.skillstorm.week5.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class HashMapDriver<K, V> {

	public static void main(String[] args) {
		/*
		 * HashMap
		 * 
		 * Store data in key-value pairs
		 * - The key is like an actual key (think key to a locker)
		 * - The value is what's inside the locker
		 * 
		 * They also use hash code and equals in order to ensure super fast lookup times
		 * 
		 * Keys must be unique
		 * - We perform the hash code and equals on the keys
		 * - Is because we can store multiple of the same value
		 * 
		 * Examples of Key-Value Pairs:
		 * 1. House key and inside house
		 * 2. Hashtags and the posts associated with it
		 * 3. Google queries and the posts returned by it
		 * 4. Car key and the actual car
		 * 5. Question and an Answer
		 * 6. Vending machine spot (G6) and a "queue" of food items
		 * 7. Book ISBN and the actual book
		 * 8. SSN and the person
		 */
		
		// The data type for the key and the value do not necessarily have to be the same
		// Saying that an Integer value is "mapped" to a String value
		HashMap<Integer, String> numMap = new HashMap<>();
		
		/*
		 * One
		 * Uno
		 * Uns
		 * Eins
		 */
		
		// Adding to hash map
		numMap.put(1, "One");
		numMap.put(2, "Two");
		numMap.put(3, "Three");
		
		// This is added since 6 is not a key already in the map
		numMap.put(6, "Two");
		
		// Retrieve items from map
		System.out.println(numMap.get(1));
		
		// If I "put" an element that's already in my map, I'll update it
		numMap.put(1, "Uno"); // One is changed to Uno

		numMap.remove(3);
		
		System.out.println(numMap);
		
		/*
		 * Let's write a HashMap that "maps" hashtags to posts
		 * 
		 * This maps a string (hashtag) to a list of associated posts
		 * 
		 * Only the key do we use the hash code and equals for
		 * The object we just retrieve the data from using the key
		 */
		HashMap<String, LinkedList<Post>> hashtags = new HashMap<>();
		Post exploringTheNetherlands = new Post("Exploring the Netherlands", "Come see the Netherlands!", "Steve Martin");
		Post sightseeingInIreland = new Post("Sightseeing In Ireland", "Ireland is such a wonderful place!", "George George");
		Post touringNeverland = new Post("Touring Neverland", "Come on Wendy, we're off to see Neverland!", "Peter");
		
		hashtags.put("#travel", new LinkedList<>(Arrays.asList(exploringTheNetherlands, sightseeingInIreland, touringNeverland)));
		hashtags.put("#ireland", new LinkedList<>(Arrays.asList(sightseeingInIreland)));
		
		System.out.println(hashtags);
		
		// This gives me all of the posts about travel
		LinkedList<Post> posts = hashtags.get("#travel");

		System.out.println("\nDisplaying all #travel posts:\n");
		for (Post post : posts) {
			System.out.println(post.getContent());
		}
		
		
		// Removing from a HashMap
//		hashtags.remove("#ireland");
		
		System.out.println(hashtags.get("#ireland"));
		
		// Add to the HashMap only if the key isn't in there
		
		hashtags.putIfAbsent("#travel", null);
		
		System.out.println(hashtags.get("#travel"));
		
		// Takes the hashcode of the key provided and checks that entire bucket for the key
		if (hashtags.containsKey("#california")) {
			System.out.println("Contains posts about California");
		}
		else {
			System.out.println("No posts on California could be found");
		}
		
		System.out.println(numMap);
		numMap.remove(2);
		numMap.remove(6);
		System.out.println(numMap);

		
		// containsValue searches the entire map for a value matching the one given
		if (numMap.containsValue("Two")) {
			System.out.println("Two exists as a value somewhere in the map");
		}
		else {
			System.out.println("Two does not exist in the map");
		}
		
		// HashMap<String, LinkedList<Post>>
		
		// Iterate over the keys of our HashMa
		
		// We cannot use a standard for loop since there are no indices for our Maps/Sets. We MUST use a for-each
		for (String key : hashtags.keySet()) {
			System.out.println(key);
//			for (Post post : hashtags.get(key)) {
//				System.out.println(post);
//			}
		}
		
		// Iterate over the values of our HashMap
		for (LinkedList<Post> value : hashtags.values()) {
			System.out.println(value);
		}
		
	}

}
