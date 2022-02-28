package com.skillstorm.week5.day1;

import java.util.Objects;

public class Company {

	private String name;
	private int numWorkers;
	private String taxId;
	
	public Company() {
		
	}
	
	public Company(String name, int numWorkers, String taxId) {
		this.name = name;
		this.numWorkers = numWorkers;
		this.taxId = taxId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumWorkers() {
		return this.numWorkers;
	}
	
	public void setNumWorkers(int numWorkers) {
		this.numWorkers = numWorkers;
	}
	
	public String getTaxId() {
		return this.taxId;
	}
	
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.numWorkers + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Company)) {
			return false;
		}
		Company other = (Company) obj;
		// This is if you have chosen to forego the Objects.equals() method 
//		if (this.name == null) {
//			if (other.name != null) {
//				return false;
//			}
//		}
//		else if (!this.name.equals(other.name)) {
//			return false;
//		}
		int numPropertiesEqual = 0;
		if (Objects.equals(this.name, other.name)) {
			numPropertiesEqual++;
		}
		if (Objects.equals(this.taxId, other.taxId)) {
			numPropertiesEqual++;
		}
		if (this.numWorkers == other.numWorkers) {
			numPropertiesEqual++;
		}
		if (numPropertiesEqual >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * What is a hash?
	 * 
	 * We calculate a hash to determine what bucket number the data should go into
	 * Ideally, this is a unique number and we can keep the data in smaller piles
	 * 
	 * Think of the hash as a "bucket" containing all values with that hash
	 * 
	 * The hash should be deterministic
	 * Based on the values I provide, I should get back the exact same hash
	 * 
	 * What happens if a object that is different comes out to be the same hash code?
	 * 
	 * Bad hashing can lead to many collisions which will drastically affect performance
	 * 
	 * Multiple "collisions" will result in many elements be located in the same bucket making our read times much slower
	 * Additionally, our data is all in one spot, which can potentially be bad
	 * 
	 * Ideally, we want our hash's dispersed and kept minimal in size to ensure fast lookup times
	 * 
	 * This is a "constant" time operation ( O(1) ), but technically it's not always O(1), but is very close it usually
	 * 
	 * When we override hashCode you should ALWAYS override equals too, and vice versa
	 * The reason why, is because we need the ability to determine if our object is in that "bucket"
	 */
	@Override
	public int hashCode() {
		int result = 1;
		// I will use each of the properties of the object to determine the hash of my object
		if (name != null) {
			result = 31 * result + (name.length() * name.charAt(0));
		}
		if (taxId != null) {
			result = 31 * result + (taxId.length() * taxId.charAt(0));
		}
		result = 31 * result + numWorkers;
		
		return result; // The result returned is our "hash"
	}
}
