package com.skillstorm.week4.day5.comparatorPractice;

import java.util.Collections;
import java.util.LinkedList;

/*
 * This class will just store data pertaining to a person
 * 
 * We will use Comparators to determine which Person is "greater" or "less" than another Person
 * 
 * One key difference with Comparators is that the Person class won't implement Comparator
 * 
 * We'll instead define a new Comparator class
 */
public class Person {

	private String name;
	private int age;
	private int iq;
	
	public Person() {
		
	}
	
	public Person(String name, int age, int iq) {
		this.name = name;
		this.age = age;
		this.iq = iq;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
	
	public String toString() {
		return "[" + this.name + ", " + this.age + ", " + this.iq + "]";
	}

	public static void main(String[] args) {
		Person craig = new Person("Craig", 22,  95);
		Person john = new Person("John", 56, 102);
		Person brad = new Person("Brad", 35, 220);
		
		LinkedList<Person> peopleList = new LinkedList<>();
		peopleList.add(john);
		peopleList.add(craig);
		peopleList.add(brad);
		
		System.out.println(peopleList);
		
		AgeComparator ageComp = new AgeComparator();
		Collections.sort(peopleList, ageComp); // This will sort my peopleList using my AgeComparator
		System.out.println("Sorting by age");
		System.out.println(peopleList);
		
		Collections.sort(peopleList, new IqComparator());
		System.out.println("Sorting by iq");
		System.out.println(peopleList);
		// In order to compare two Person objects, I need to implement either Comparable or Comparator
	}

}
