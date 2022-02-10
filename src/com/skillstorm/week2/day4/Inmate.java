package com.skillstorm.week2.day4;

public class Inmate {
	
	// Instance variables AKA properties of an Inmate
	String name; // Joe, etc.
	String crime; // Murder, Stealing
	String sentence; // 10 years
	double timeServed; // 2.5 years
	boolean hasGoodBehaviorCredit;
	
	public Inmate() {
		
	}
	
	public Inmate(String name, String crime, boolean hasGoodBehaviorCredit) {
		this.name = name;
		this.crime = crime;
		this.sentence = typeOfCrime();
		this.timeServed = 0;
	}
	
	public Inmate(String name, String crime, boolean hasGoodBehaviorCredit, double timeServed) {
		this.name = name;
		this.crime = crime;
		this.hasGoodBehaviorCredit = hasGoodBehaviorCredit;
		this.sentence = typeOfCrime();
		this.timeServed = timeServed;
	}
	
	// Helper functions | utility functions
	// Usually private, but they are useful for repetitive logic or helpful logic that you use throughout the
	// interior of your class
	public String typeOfCrime() { // "MURDER"
		// If crime is null, .equals on it would break (Only if on the left)
		if ("murder".equals(crime))
			return "life";
		if ("assault".equals(crime))
			return "2";
		if ("pettyTheft".equals(crime))
			return "1";
		if ("armedRob".equals(crime))
			return "10";
		if ("grandTheft".equals(crime))
			return "5";
		if ("sexCrime".equals(crime))
			return "5";
		else 
			return "1";
	}
	
	public boolean hasGoodBehavior() {
		// Logic that determines whether the inmate has had good behavior or not
		return true;
	}
	
	// This function just determines if a person is good for their parole
	public void evaluateParoleStatus() {
		System.out.println("Evaluating " + this.name + "'s parole status:");
		
		if ("life".equals(this.sentence)) {
			System.out.println("You are not cleared for parole due to your life sentence");
			return;
		}
		// We could use hasGoodBehavior to factor in on the parole status
		
		double totalSentenceTime = Double.parseDouble(sentence);
		double sentenceRemaining = calculateRemainingSentence(totalSentenceTime);
		
		System.out.println("The total sentence time is: " + totalSentenceTime);
		System.out.println("The sentence time remaining is: " + sentenceRemaining);
		if (hasGoodBehaviorCredit) {
			sentenceRemaining -= 0.5;
		}
		if (sentenceRemaining <= 0) {
			System.out.println("You have been cleared for a parole");
		}
		else {
			System.out.println("You have not been granted a parole");
		}
		
	}
	
	private double calculateRemainingSentence(double totalSentenceTime) {
		return totalSentenceTime - timeServed;
	}
}
