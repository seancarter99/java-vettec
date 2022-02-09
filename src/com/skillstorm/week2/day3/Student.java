package com.skillstorm.week2.day3;

import java.util.Arrays;

public class Student {

	// Step 1: Ask yourself, what do I need to describe a Student?
	private String firstName;
	private String lastName;
	private String schoolName;
	private float gpa; // preK - 12
	private int idNum;
	private String[] courses = new String[10];
	boolean athlete;
	// What is we made the classes array a Course object and not a String?
	// That Course could store data such as grade, the people in the class, so on and so forth
	
	// Step 2: How do I create a Student?
	public Student(String firstName, String lastName, String schoolName, float gpa, int idNum, String[] courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.schoolName = schoolName;
		this.gpa = gpa;
		this.idNum = idNum;
		for (int i = 0; i < courses.length; i++) {
			this.courses[i] = courses[i];
		}
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public float getGpa() {
		return this.gpa;
	}
	
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public int getIdNum() {
		return this.idNum;
	}
	
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String[] getCourses() {
		// Making a copy of our array
		// Creates a new array, stored elsewhere in memory
		// That way, when someone changes it, it doesn't actually Mark's array
		
//		String[] courses = new String[this.courses.length];
		//                  copy from this array, makes the new array the same length as the old
		return Arrays.copyOf(this.courses, this.courses.length);
		
//		String[] courses = new String[10];
//		for (int i = 0; i < this.courses.length; i++) {
//			courses[i] = this.courses[i];
//		}
//		return courses;
	}
	
	public void addCourse(String course) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == null) {
				courses[i] = course;
				return;
				// break; but considered mostly as bad practice
			}
		}
	}
	
	// Boolean getter
	public boolean isAthlete() {
		return this.athlete;
	}
	
	public void setAthlete(boolean athlete) {
		this.athlete = athlete;
	}
}
