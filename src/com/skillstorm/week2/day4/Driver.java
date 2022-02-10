package com.skillstorm.week2.day4;

public class Driver {

	public static void main(String[] args) {
		Inmate joe = new Inmate();
		Inmate sally = new Inmate();
		
//		System.out.println("Does Joe have good behavior credit? "  + joe.goodBehaviorCredit);
//		System.out.println("Does Sally have good behavior credit? "  + sally.goodBehaviorCredit);
//		
//		sally.goodBehaviorCredit = true;
//		
//		System.out.println("Does Joe have good behavior credit? "  + joe.goodBehaviorCredit);
//		System.out.println("Does Sally have good behavior credit? "  + sally.goodBehaviorCredit);
//		
//		Inmate buck = new Inmate();
//		System.out.println("Does Buck have good behavior credit? "  + buck.goodBehaviorCredit);
//		
//		buck.printHello();
		
		Inmate mike = new Inmate("Mike", "murder", false);
		Inmate maggie = new Inmate("Maggie", "pettyTheft", true , 0.5);
		
		maggie.evaluateParoleStatus();
		System.out.println("\n");
		mike.evaluateParoleStatus();
	}
}
