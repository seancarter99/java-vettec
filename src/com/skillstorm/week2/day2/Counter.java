package com.skillstorm.week2.day2;

public class Counter {
	
	int count;
	boolean isOver100;
	char letter;
	String name;
	
	// Default constructor exists since I didn't assign one
	public Counter() {
		super();
		name = "N/A";
	}
	
	public Counter(int initialCount) {
		count = initialCount;
	}
	
	public void incrementCount() {
		count++;
	}
	
	public void incrementCount(int increment) {
		count += increment;
	}
	
	public void decrementCount() {
		count--;
	}
	
	// Instance methods
	// Functions without static can only be called by an instance of a class (Object)
	public void decrementCount(int decrement) {
		count -= decrement;
	}

	public static void main(String[] args) {
		String applePie = new String("Apple pie");
		String pie = "Apple pie"; // The equivalent of doing new String("Apple pie");
		System.out.println(pie.substring(2));
		
		// Instance of the class
		Counter counter = new Counter();
		System.out.println(counter.count);
		counter.incrementCount(10);
		System.out.println(counter.count);
		counter.incrementCount();
		System.out.println(counter.name);
		counter.decrementCount(1000);
		System.out.println("Count after decrement: " + counter.count);
		
		Counter counter2 = new Counter();
		System.out.println("Counter2's count: " + counter2.count);
		System.out.println("Counter1's count: " + counter.count);
		
//		decrementCount(); // Doesn't work because decrementCount is not static
	}

}
