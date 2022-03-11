package com.skillstorm.week6.day5;

public class Owner {

	private String name;
	private Dog pet;
	
	public Owner(String name, Dog pet) {
		this.name = name;
		this.pet = pet;
		if (pet != null)
			pet.setOwner(this); // Sets the dog's owner to be the new object
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getPet() {
		return pet;
	}
	
	// Transfer ownership of my dog to another Owner
	public void transferOwnership(Owner newOwner) {
		this.pet.setOwner(newOwner);
		newOwner.pet = this.pet;
		this.pet = null;
	}
}
