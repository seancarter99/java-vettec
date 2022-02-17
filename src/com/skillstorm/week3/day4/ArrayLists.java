package com.skillstorm.week3.day4;

import java.util.ArrayList;

import com.skillstorm.week2.day5.Circle;
import com.skillstorm.week2.day5.Shape;
import com.skillstorm.week2.day5.Square;
import com.skillstorm.week2.day5.Triangle;

public class ArrayLists {

	public static void main(String[] args) {
		
		/*
		 * What makes an ArrayList an ArrayList?
		 * 
		 * 1. Stores data as a list
		 * 2. Data is stored sequentially in memory
		 * 3. Non-Primitive
		 * 4. Contiguous in memory
		 * 5. 0-Indexed
		 * 6. Random access
		 * 7. Elements are homogeneous in terms of type
		 * 8. Initialize a size up front
		 * 
		 * All of above is the same as an array
		 * 
		 * 9. Non-Fixed size (Automatically resize the array for us if you go over the limit)
		 * 10. Come with out of the box methods that make your life easier (add, remove, removeAll, etc.)
		 * 11. ArrayLists can NOT store primitives in it (for primitives, use the wrapper class)
		 * 
		 * An ArrayList is an abstraction over your standard arrays in order to make them easier to use
		 * 
		 * They do the logic for list resizing for you
		 * 
		 * ArrayLists implement an interface called "List"
		 * 
		 * List details what is required of an object implementing it to be deemed a list
		 */
		
		// How to declare/instantiate an ArrayList
		// Add the type in the diamonds to specify what data type the array list holds
		
		
		// Since Java 8, the String inside the diamond on the right is no longer required. You can do <> instead
		
		// Using ArrayList's default constructor creates an array with a size already in it
		ArrayList<String> musicArtists = new ArrayList<>();
		
		// size() does a similar thing to length
		// size() is a method that returns the total number of elements in the array
		System.out.println("ArrayList size before adding artists: " + musicArtists.size());
		
		// To add an element to an array list, use the add() function
		
		musicArtists.add("Prince");
		musicArtists.add("Pearl Jam");
		musicArtists.add("Usher");
		
		// I can also add an element at a specific index
		// Dolly gets added to index 0, everything else gets pushed over 1 space
		musicArtists.add(0, "Dolly Parton");
		
		System.out.println("ArrayList size after adding artists: " + musicArtists.size());
		
		// Unlike an array, I can print an ArrayList since it overrode Object's toString method
		System.out.println(musicArtists);
		
		// Set changes the value at that specific, it does NOT add a new element to array (size remains the same)
		// akin to nums[0] = 50;
		musicArtists.set(0, "Johnny Cash");
		
		System.out.println(musicArtists);
		
		// Add two copies of Justin Bieber
		musicArtists.add("Justin Bieber");
		musicArtists.add("Justin Bieber");
		musicArtists.add("Justin Bieber");
		
		// I want to remove any instances of Justin Bieber from my array list
		// I can remove specific elements by using the remove function
		
		// I can either remove an element at a specific index
		// OR I can remove "Justin Bieber", and my list will search for the string "Justin Bieber" and removes 
		// the first copy if it finds it
		
		System.out.println("Music artists with Justin Bieber:\n" + musicArtists);
		
		musicArtists.remove("Justin Bieber");
		musicArtists.add("Rebecca Black");
		System.out.println("Music artists without Justin Bieber:\n" + musicArtists);
		
		// I can also use a specific index to remove if I know it
		
		ArrayList<String> hitList = new ArrayList<>();
		hitList.add("Justin Bieber");
		hitList.add("Rebecca Black");
		
		// removeAll takes in a collection (ArrayList, a Queue, a LinkedList, etc.) and removes all values that are in it
		// Removes from musicArtists all copies of Justin Bieber or Rebecca Black
		musicArtists.removeAll(hitList);
		
		System.out.println("Music artists after removeAll: " + musicArtists);
		
		musicArtists.add("Justin Bieber");
		
		System.out.println(musicArtists);
		
		// I can use clear() to remove EVERYTHING from the list (and sets the size back to 0)
		musicArtists.clear();
		
		System.out.println("Music artists after clear: " + musicArtists);
		
		// You can use isEmpty() to get a true/false value depending on if the list is empty or not
		System.out.println(musicArtists.isEmpty() + " size of array is " + musicArtists.size());
		
		
		musicArtists.add("Kanye West");
		musicArtists.add("The Killers");
		musicArtists.add("Stevie Ray Vaughan");
		musicArtists.add("Twice");
		musicArtists.add("Stevie Wonder");
		
		// We can read data from our array list using the get() function
		// Like remove() we can use get with a specific index (just like arrays)
		
		// gets the element at index 2
		System.out.println(musicArtists.get(2));
		
		// I can use a for loop just like I do with arrays
		
		for (int i = 0; i < musicArtists.size(); i++) {
			System.out.println("Music artist at index " + i + ": " + musicArtists.get(i));
		}
		
		// indexOf I give it the item I want, and it gives me the first index where that item appears
		
		// Since Taylor Swift is not in the list, it returns -1 (AKA Not found)
		System.out.println("The index of Taylor Swift is: " + musicArtists.indexOf("Taylor Swift"));
		
		// To check if something is in the list or not, I can use contains()
		System.out.println("Music artists contains Stevie: " + containsLike(musicArtists, "Stevie"));
		
		// Since musicArtists stores Strings, I cannot store Integers
//		musicArtists.add(42);
		
		// Now I have an ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(42);
		numbers.add(34);
		numbers.add(null); // I can add nulls since I'm storing Integers and Integers can be nulled
		
		
		// I can also store an ArrayList of ArrayLists
		// How do I store an arraylist of arraylists containing chars?
		
		// Array equivalent is Character[][]
		ArrayList<ArrayList<Character>> charArrayLists = new ArrayList<>();
//		ArrayList<char[]> charArrayArrays = new ArrayList<>(); // Also works
		// To add to this variable, I need an ArrayList of Characters
		ArrayList<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('b');
		ArrayList<Character> charList2 = new ArrayList<>();
		charList2.add('!');
		charList2.add('?');
		charList2.add('_');
		
		charArrayLists.add(charList);
		charArrayLists.add(charList2);
		
		System.out.println(charArrayLists);
		
		// To loop through them
		
		// Syntax for a standard for loop
		for (int i = 0; i < charArrayLists.size(); i++) {
			for (int j = 0; j < charArrayLists.get(i).size(); j++) {
				System.out.println(charArrayLists.get(i).get(j));
			}
		}
		
		// Standard for loop with slightly easier syntax
		for (int i = 0; i < charArrayLists.size(); i++) {
			ArrayList<Character> list = charArrayLists.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
		}
		
		// For each is a lot more clear what's going on
		System.out.println("\nFor Each loop:");
		for (ArrayList<Character> list : charArrayLists) {
			for (Character c : list) {
				System.out.println(c);
			}
		}
		
		// I can store object that I define in an ArrayList
		ArrayList<Shape> shapes = new ArrayList<>();
		Triangle triangle = new Triangle(10, 5.5);
		// I can add Triangles since class Triangle extends Shape (and therefore IS a shape)
		shapes.add(triangle);
		shapes.add(new Square(7.0));
		shapes.add(new Circle(35.2));
		
		// I have now an ArrayList of Shapes
		// To print it properly, we need to implement toString in all of those shapes
		System.out.println(shapes);
		
		for (Shape shape : shapes) {
			System.out.println(shape.getType() + " area: " + shape.getArea());
		}
		
		/*
		 * Types of arrays I can have:
		 * 
		 * - int[]
		 * - Integer[]
		 * - int[][]
		 * - Integer[][]
		 * - double[]
		 * - float[]
		 * - char[]
		 * - Character[]
		 * - boolean[]
		 * - Boolean[]
		 * - String[]
		 * - Shape[]
		 * - Country[]
		 * - DevelopingCountry[]
		 * - VideoGame2020[]
		 * - Food[]
		 * - Restaurant[]
		 * - AFDASFDS[]
		 * 
		 * You can have an infinite amount of data types for arrays
		 */
		
		AFDASFDS myVar = new AFDASFDS();
		myVar.doStuff();
		
		ArrayList<AFDASFDS> myArrList = new ArrayList<>();
		
		
	}
	
	public static boolean containsLike(ArrayList<String> list, String pattern) {
		for (String item : list) {
			if (item.contains("Stevie")) {
				return true;
			}
		}
		return false;
	}
}
