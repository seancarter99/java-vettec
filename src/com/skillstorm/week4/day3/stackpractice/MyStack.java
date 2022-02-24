package com.skillstorm.week4.day3.stackpractice;

// Be sure to add your diamond operator to the class
// That's your generic and allows the class to be created holding ANY non-primitive type
public class MyStack<T> {
	
	/*
	 * What properties does my stack need to be functional?
	 */
	
	// This node refers to whatever the top of the stack currently is
	private Node<T> top; // HAS-A
	
	// This will just refer to the current size of my stack (how many elements are on it)
	private int size;

	public MyStack() {
		
	}
	
	/*
	 * Push will take in an item of type T and place it on the top of the stack
	 * Any other items are going to be below this new item
	 */
	public void push(T item) { 
		if (item == null) {
			throw new IllegalArgumentException("No null entries allowed!");
		}
		if (top == null) {
			// Creates a new node holding the value of the item we're trying to add
			Node<T> newTop = new Node<T>(item);
			top = newTop;
			size++;
			return;
		}
		Node<T> newTop = new Node<T>(item);
		newTop.setNext(top); // This says that this node now points to the top
		top = newTop; // This updates our stack to refer to the new top created
		size++; // Add 1 to size because we just added an element
	}
	
	// Pop will take no parameters, but "pop" or remove the top element in the stack and return its value
	// If the stack is currently empty, this will throw an exception
	public T pop() {
//		size--; // Size-- being here allows our stack size to go into the negatives
		if (top == null) {
			throw new IllegalArgumentException("Cannot pop empty stack!");
		}
		// size-- can go on any line after this null check and before the return
		// T value = top.getValue(); // This also works if you return value
		Node<T> oldTop = top; // Temporary variable to hold our old top's data
		top = top.getNext(); // Set the stack's top to be the next in line
		size--;
		return oldTop.getValue(); // This returns the value of the top element
	}
	
	// Peek is mostly the same as pop, but will "peek" at the top element in the stack, WITHOUT REMOVING, and return its value
	// If the stack is currently empty, this DOES NOT throw an exception, rather, it returns null
	public T peek() {
		if (isEmpty()) {
			// I could also throw an exception here
			return null; // Stack is empty so I return null
		}
		return top.getValue();
	}
	
	// Returns true if the stack is currently empty and false otherwise
	public boolean isEmpty() {
//		Another way of writing it
//		if (size == 0) {
//			return true;
//		} else {
//			return false;
//		}
		
		return size == 0;
	}
	
	// Returns the current size of my stack
	public int size() {
		return this.size;
	}
	
	// Function continuously adds the values to one big string and then returns it for printing purposes
	@Override
	public String toString() {
		String str = "[";
		Node<T> currNode = top; // Starting with the top go through and print the whole stack without removing anything
		while (currNode != null) {
			str += currNode.getValue(); // Add the value stored in that node to our string
			
			if (currNode.hasNext()) { // If there's no next, that means it's the final element in line so no comma
				// If there's a next node in the sequence, add a comma
				str += ", ";
			}
			
			// Advance our pointer
			currNode = currNode.getNext(); // It changes our pointer from one node to that node's neighboring node
		}
		str += "]";
		return str;
	}
	
	public static void main(String[] args) {
		MyStack<String> names = new MyStack<>();
		names.push("Bob");
		System.out.println(names.peek());
		names.push("Mary");
		names.push("Gertrude");
		
		
		System.out.println(names); // I print what's in the stack at this line [Gertrude, Mary, Bob]
		
		
		names.push("Kenya");
		
		System.out.println(names);
		System.out.println(names.peek()); // This will print Kenya since she's the top
		
		names.push("George");
		System.out.println(names.pop());
		
		System.out.println("Top value after popping George: " + names.peek());
		
		System.out.println("Popping two elements");
		names.pop();
		names.pop();
		
		System.out.println("The new top after popping Kenya and Gertrude is: " + names.peek());
		
		String mary = names.pop();
		System.out.println(mary);
		System.out.println(mary.toUpperCase());
		
		
		/*
		 * MyStack is the data type or class
		 * <Integer> is the non-primitive data type that will fill in the generic "T" in the MyStack
		 * nums is the name of variable holding the MyStack<Integer> object
		 * new tells Java to make space in the Heap for a MyStack<Integer> object
		 * MyStack<>() calls the MyStack constructor
		 */
		MyStack<Integer> nums = new MyStack<>();
		
		MyOtherStack<Integer> numbers = new MyOtherStack<>();
		
		/*
		 * int vs Integer
		 * 
		 * - int is a primitive
		 * - int cannot be nulled (Integer can)
		 * - Integer is stored in the heap
		 * - Integer has methods on it such as intValue(), toString(), etc.
		 * - Integer is commonly know as a "wrapper class"
		 */
		
		/*
		 * Common use cases of stacks (Where do you see them in everyday life?)
		 * 
		 * Browser's page history is a stack
		 * - Back arrow goes to previously visited pages in the stack
		 * - Forward arrow goes back to the deepest page in the stack (the top)
		 * - Hitting the back arrow and visiting page instead pops everything above it off the stack and adds the new page to it
		 */
	}

}
