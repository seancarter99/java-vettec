package com.skillstorm.week13.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.skillstorm.week13.src.*;

public class CandidateTest {

	// To set up a JUnit test, all tests must have the @Test annotation attached to a function
	@Test
	public void createCandidateWithNullName() {
		// This code should throw an exception
		
		// This code works at preventing the exception, but it's a touch verbose
//		try {
//			Candidate c = new Candidate(null, "Null Party");
//			fail("Candidate shouldn't successfully create");
//		} catch (IllegalArgumentException e) {
//			
//		}
		
		// JUnit has a specific way of ensuring an exception is thrown
		// I pass assertThrows the type of exception and a lambda of code that should throw an exception
		assertThrows(IllegalArgumentException.class, () -> { 
			Candidate c = new Candidate(1, null, "Null Party");
		});
	}
	
	@Test
	public void changeExistingCandidateNameToNull() {
		assertThrows(IllegalArgumentException.class, () -> { 
			Candidate c = new Candidate(1, "John Doe", "Green Party");
			c.setName(null);
		});
	}
	
	@Test
	public void createCandidateWithNegativeVotes() {
		assertThrows(IllegalArgumentException.class, () -> { 
			Candidate c = new Candidate(1, "John Doe", "Republican Party", -1);
		});
	}
	
	@Test
	public void createValidCandidateWithNoVotes() {
		// in JUnit 5, use assertDoesNotThrow instead
		try {
			Candidate c = new Candidate(1, "John Doe", "Democratic Party");
		} catch (Exception e) {
			fail("Unable to create candidate");
		}
	}
	
	@Test
	public void createValidCandidateWithInitialVotes() {
		Candidate c = new Candidate(1, "John Doe", "Democratic Party", 500);
		// If it makes it to the end, it's valid
	}
	
	@Test
	public void compareCandidateWithNull() {
		// assertEquals you will use 80% of the time
		// It takes two parameters
		// First is the expected result
		// Second is the actual result received
		
		// Should be -1 since null candidates go to the end of the line
		Candidate c = new Candidate(2, "Mary Smith", "Republican Party");
		assertEquals(-1, c.compareTo(null));
	}
	
	@Test
	public void compareCandidateWithSelf() {
		Candidate c = new Candidate(2, "Mary Smith", "Republican Party");
		assertEquals(0, c.compareTo(c));
	}
	
	@Test
	public void compareCandidateWithSameVoteCandidate() {
		Candidate c1 = new Candidate(2, "Mary Smith", "Republican Party", 201);
		Candidate c2 = new Candidate(3, "Jane Austen", "English Party", 201);
		assertEquals(0, c1.compareTo(c2));
		assertEquals(0, c2.compareTo(c1));
	}
	
	@Test
	public void compareCandidateWithGreaterVoteCandidate() {
		Candidate c1 = new Candidate(2, "Mary Smith", "Republican Party", 201);
		Candidate c2 = new Candidate(3, "Jane Austen", "English Party", 2001);
		assertEquals(1, c1.compareTo(c2));
		
	}
	
	@Test
	public void compareCandidateWithLessVoteCandiate() {
		Candidate c1 = new Candidate(2, "Mary Smith", "Republican Party", 201);
		Candidate c2 = new Candidate(3, "Jane Austen", "English Party", 2001);
		assertEquals(-1, c2.compareTo(c1));
	}
	
	@Test
	public void candidateEqualsSelf() {
		Candidate c = new Candidate(1, "John Doe", "Democratic Party");
		assertTrue(c.equals(c));
	}
	
	@Test
	public void candidateEqualsSimilarCandidate() {
		Candidate c1 = new Candidate(1, "John Doe", "Democratic Party");
		Candidate c2 = new Candidate(1, "John Doe", "Democratic Party");
		assertTrue(c1.equals(c2));
	}
	
//	@Test
//	public void test() {
//		// This line causes the test to fail always
//		// Removing the line will cause the test to pass since it makes it through the function with no errors
////		fail("Not yet implemented");
//	}

}
