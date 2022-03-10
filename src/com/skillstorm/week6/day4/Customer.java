package com.skillstorm.week6.day4;

import java.time.LocalDate;

public class Customer {

	private String name;
	private String drinkChoice;
	private LocalDate birthday;
	
	public Customer() {
		
	}
	
	public Customer(String name, String drinkChoice, LocalDate birthday) {
		this.name = name;
		this.drinkChoice = drinkChoice;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkChoice() {
		return drinkChoice;
	}

	public void setDrinkChoice(String drinkChoice) {
		this.drinkChoice = drinkChoice;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", drinkChoice=" + drinkChoice + ", birthday=" + birthday + "]";
	}
}
