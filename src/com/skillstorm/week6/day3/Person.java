package com.skillstorm.week6.day3;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String city;
	private String state;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String gender, String city, String state) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.state = state;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city + ", state=" + state
				+ "]";
	}
}
