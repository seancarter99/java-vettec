package com.skillstorm.week4.day3.stackpractice;

// The generic is used to store the data passed onto the stack
public class Node<T> {
	
	/*
	 * All the node does is it stores our data and contains a reference to its neighboring node
	 * 
	 * That node is completely independent; it has its own data, and its own neighbors
	 */
	
	// The data being stored in the node (It's T because T represents whatever non-primitive data the user wants it to be)
	private T value;
	
	// The node that is next in the chain. If null, then there is no next in the chain
	private Node<T> next;
	
	// We'll call this constructor whenever we want to create a new node that doesn't point to anything
	public Node(T value) {
		this.value = value;
	}
	
	// We'll call this constructor whenever we want to create a new node that points to another node
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public boolean hasNext() {
		// If the next element is null, that means there's no next element in line
		return this.next != null;
	}
}
