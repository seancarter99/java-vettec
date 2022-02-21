package com.skillstorm.week4.day1.links;

// Nodes are just going to store the data I need in my LinkedList

/*
 * Generics allow me to add a placeholder type in my class definition that will get filled in when they create the class
 * 
 * If I create a node like: Node<String> node = new Node<>();
 * 
 * The T is one of the standards as it's short for "Type"
 * Could also use E standing for "Element"
 * All that matters is that it's the same everywhere you use it
 */
public class Node<T> {

	private T value; // The node HAS-A monkey for example
	private Node<T> next; // The next node in the chain. This next node also has a value and a next property too
	
	public Node() {
		
	}
	
	public Node(T value) {
		this.value = value;
		// this.next = null;
	}
	
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
}
