package com.skillstorm.week4.day1.links;

// A class to mime to behavior of a standard LinkedList

/*
 * What do I need to be a LinkedList?
 * 
 * 1. Contains a bunch of nodes that are "linked" together
 * 2. I need to know the "head" or start of the LinkedList
 * 3. I can also have the "tail" or the end of the LinkedList
 * 4. I need the total size of the LinkedList
 */

// When they create MyLinkedList, the T will be replaced with the type
// MyLinkedList<Rectangle> list = new MyLinkedList<>(); will replace all T's with Rectangle's
public class MyLinkedList<T> {

	private Node<T> head;
//	private Node<T> tail;
	private int size;
	
	public MyLinkedList() {
		
	}
	
	// What functions do I need for my LinkedList?
	
	// This add will add the item to the end of the list
	public void add(T item) {
		/*
		 * 1. What do I do if the LinkedList is currently empty?
		 * 2. What do I do if the LinkedList is not currently empty?
		 */
		// If head is null, then my list is empty (there is no head so far)
		// So I will make one
		if (this.head == null) {
			// I give my new node the item to hold
			// I also assign that new node to my head so now my head is not null, but rather the new node that I created
			this.head = new Node<>(item);
			size++; // Add 1 to size because we added an element to it
			return; // Exit the function. Job well done
		}
		
		// Happens if the list wasn't currently empty
		
		/*
		 * I will traverse the entire LinkedList until reaching the end. Once I'm at the end, I will add my new Node
		 * 
		 * Remember, that if the Node's next property is null, that means there's nothing after in the chain (AKA: The end)
		 */
		
		// Create a temporary "traversal node" that we use to check the values of our LinkedList
		Node<T> currNode = this.head;
		// currNode represents the current node that we're looking at, starting at the "head" or front of the list
		
		// I want to loop until the node I'm currently at doesn't have a next node in the chain
		while (currNode.getNext() != null) {
			currNode = currNode.getNext(); // Changes the current node to be the next node in the line
		}
		
//		for (Node<T> currNode = this.head; currNode.getNext() != null; currNode = currNode.getNext()) {
//			
//		}
		
		// Down here, currNode will be the "tail" of our LinkedList
		// As such, we can just add our new node here
		
		// I will create the new Node containing the value we want to add
		// Then I will set the next value of currNode to be our new node
		Node<T> newNode = new Node<>(item);
		currNode.setNext(newNode); // Draws the arrow from one circle to another
		size++;
	}
	
	// Return the value that is held at a given index
	public T get(int index) {
		// Junk value, so we toss it
		if (index < 0 || index >= this.size) { // Throws if index is -32 or when size = 5 and they give me 6
			throw new IndexOutOfBoundsException("The index must be non-negative and less than the total size of the list.");
		}
		/*
		 * I want to loop through my LinkedList until I reach the index I'm trying to read from
		 */
		int currIndex = 0;
		Node<T> currNode = this.head;
		while (currNode != null) { // If currNode is null, that means we reached the end of the line
			if (currIndex == index) {
				// We've reached the spot of the list we're interested in
				return currNode.getValue(); // Return the value here
			}
			currNode = currNode.getNext();
			currIndex++;
		}
		
		return null; // No value found
	}
	
	public boolean contains(T element) {
		return searchForElement(head, element);
	}
	
	private boolean searchForElement(Node<T> currNode, T element) {
		if (currNode == null) {
			return false; // I've reached the end of the chain, no node was found
		}
		if (currNode.getValue() == element) {
			// I found the item so I return true
			return true;
		}
		
		// If this node doesn't contain my value, I will "defer" in a sense, and see what the next in line has to say
		return searchForElement(currNode.getNext(), element);
	}
	
	// Removes the item from the list that matches the specified index and returns it
	// I choose to return T, just in case they want to use it. They can ignore it if they want
	public T remove(int index) {
		return null;
	}
	
	// I call it size() because that's how Java's LinkedList does it
	public int size() {
		return this.size;
	}
	
	// I'm going to write a toString method so that I can print my LinkedList
	@Override
	public String toString() {
		String str = "[";
		Node<T> currNode = head;
		while (currNode != null) {
			str += currNode.getValue();
			if (currNode.getNext() != null) {
				str += ", "; // Add the comma only if there's something left in the chain
			}
			currNode = currNode.getNext(); // This gets us to the next node in the chain
		}
		str += "]";
		return str;
	}
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(2);
		System.out.println(list.size());
		list.add(0);
		System.out.println(list.size());
		System.out.println(list);
		
		
		MyLinkedList<String> fruits = new MyLinkedList<>();
		fruits.add("Watermelon");
		fruits.add("Peach");
		fruits.add("Honeydew");
		
		fruits.add("Pineapple");
		System.out.println(fruits);

		
		System.out.println(fruits.get(2));
		
		System.out.println(fruits);
		
		if (fruits.contains("Honeydew")) {
			System.out.println("Found honeydew!");
		} else {
			System.out.println("No honeydew found");
		}
		
		if (fruits.contains("Strawberry")) {
			System.out.println("Found strawberry!");
		} else {
			System.out.println("No strawberry found");
		}
	}
}
