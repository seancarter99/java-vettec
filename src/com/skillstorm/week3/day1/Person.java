package com.skillstorm.week3.day1;

public class Person extends IceCream {
	   private String name;
	   
	   public Person(String name) {
		   super(); // Calling the Object constructor
	      this.name = name;
	   }
	   
	   public void sayName() {
	      System.out.println("My name is " + this.name);
	   }
	   
	   public String getName() {
		   return this.name;
	   }
	   
	   public void setName(String name) {
		   this.name = name;
	   }
	   
	   public static void main(String[] args) {
	      Person jack = new Person("Jack"); // name = "Jack"
	      Person jill = new Person("Jill"); // name = "Jill"
	      jack.setName("Bill");
	      jill.sayName();
	      jack.sayName();
	      
	      final int num = 5; // I'm able to initialize it
//	      num = 6; // Can't reassign it
	   }
	   
	   protected void sayHello() {
		   System.out.println("Hello!");
	   }
}

class Student extends Person {

	public Student(String name) {
		super(name);
		this.setName("Fred");
		// TODO Auto-generated constructor stub
	}
	
	public void doSomething() {
		this.sayHello();
	}
}