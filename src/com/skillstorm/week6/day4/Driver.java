package com.skillstorm.week6.day4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		Bar bar = new Bar("Sean's Bar");
		Customer bella = new Customer("Bella", "Long Island Iced Tea", LocalDate.of(2001, 3, 10));
//		bar.serviceCustomer(bella);
		
		Customer danielle = new Customer("Danielle", "Hennessey On the Rocks", LocalDate.of(2001, 3, 9));
//		bar.serviceCustomer(danielle);
		
		Customer timmy = new Customer("Timmy", "Apple Juice", LocalDate.now());
		Customer troy = new Customer("Troy", "Spiked Cream Soda", LocalDate.of(100, 1, 1));
		
		LinkedList<Customer> customers = new LinkedList<>(Arrays.asList(bella, danielle, timmy, troy));
		for (Customer customer : customers) {
			try {
				bar.serviceCustomer(customer);
			} catch (IllegalArgumentException e){
				System.out.println(customer.getName() + " is not old enough\n");
			}
		}
	}

}
