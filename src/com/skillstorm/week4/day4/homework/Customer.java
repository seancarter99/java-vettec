package com.skillstorm.week4.day4.homework;

public class Customer {
	
	private IceCream iceCream;
	private String name;
	
	public Customer() {}

	public Customer(String name, IceCream flavor) {
		this.name = name;
		this.iceCream = flavor;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream flavor) {
		this.iceCream = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
