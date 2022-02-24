package com.skillstorm.week4.day4.queuepractice;

public class Node<T> {
	private T value;
	private Node<T> next;
	private Node<T> prev;
	
	public Node() {
		
	}
	
	public Node(T value) {
		this.value = value;
	}
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public Node(T value, Node<T> next, Node<T> prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	
	// Determines if this node has someone ahead of it in line
	public boolean hasNext() {
		return this.next != null;
	}
	
	public boolean hasPrev() {
		return this.prev != null;
	}
}
