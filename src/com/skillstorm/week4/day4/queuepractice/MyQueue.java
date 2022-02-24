package com.skillstorm.week4.day4.queuepractice;

import java.util.NoSuchElementException;

import com.skillstorm.week4.day4.City;

public class MyQueue<T> {

	private Node<T> front;
	private Node<T> back;
	private int size;
	
	public MyQueue() {
		
	}
	
	// No need for other constructor because I want to work with empty queues and then fill them
	
	public void add(T value) {
		Node<T> newBack = new Node<>(value);
		// Is there already a back?
		if (back != null) {
			// If yes, I have that old back point to my new node
			back.setPrev(newBack);
		}
		newBack.setNext(back);
		back = newBack;
		// This line is very important because it allows us to "create" a head
		if (front == null) {
			front = newBack;
		}
		size++;
	}
	
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return front.getValue();
	}
	
	public T poll() {
		if (isEmpty()) {
			throw new NoSuchElementException("Cannot remove an element from an empty queue");
		}
		T value = front.getValue();
		if (!front.hasPrev()) {
			back = null;
			front = null;
		}
		else {
			front = front.getPrev();
			front.setNext(null);
		}
		// Could also do away with else
		//front = front.getPrev(); 
		
		size--; // Decrement size due to removing element
		return value;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String str = "[";
		Node<T> currNode = front;
		while (currNode != null) {
			str += currNode.getValue();
			if (currNode.hasPrev()) {
				// If there's something behind the currNode, add a comma
				str += ", ";
			}
			currNode = currNode.getPrev();
		}
		str += "]";
		return str;
	}
	
	public static void main(String[] args) {
		/*
		 * How does a queue work?
		 * 
		 * Peek? Returns the value at the front
		 * Poll? Removes the value at the front
		 * Add? Adds item to the back of the queue
		 */
		MyQueue<City> cityQueue = new MyQueue<>();
		MyQueue<City> copyCityQueue = cityQueue;
		
		System.out.println(cityQueue.size() + " " + cityQueue);
		
		cityQueue.add(new City("New York"));
		
		System.out.println(cityQueue.size + " " + cityQueue);
		cityQueue.add(new City("Atlanta"));
		System.out.println(cityQueue.size + " " + cityQueue);
		
		System.out.println(cityQueue.peek());
		cityQueue.poll(); // This should remove New York
		System.out.println(cityQueue.peek()); // Atlanta is now the front of our queue
		System.out.println(cityQueue.size + " " + cityQueue);
		
		cityQueue.add(new City("Charleston"));
		cityQueue.add(new City("San Diego"));
		cityQueue.add(new City("Atlantis"));
		System.out.println(cityQueue.size + " " + cityQueue);

		cityQueue.poll();
		cityQueue.poll();
		cityQueue.poll();
		cityQueue.poll();
		
		System.out.println(cityQueue.size + " " + cityQueue);
		
		try {
			cityQueue.poll(); // The size is 0, therefore it's empty
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println("You can't poll an empty queue!");
		}
	}

}
