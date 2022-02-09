package com.skillstorm.week2.day3;

// File that works with Squares
public class Driver {

	public static void main(String[] args) {
		// Don't need to import Square when in the same package
		Rectangle square = new Rectangle();
//		System.out.println(square.num); // Doesn't work because it's a private variable
//		Square.printHello(); // Also doesn't work when private
		
		
		Rectangle rectangle = new Rectangle();
		Rectangle rectangleWithDimensions = new Rectangle(5.0, 10.0);
		
		// When they're private, I cannot read nor write to the variables
//		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
//		rectangleWithDimensions.length = 10.0;
//		System.out.println(rectangleWithDimensions.length + " " + rectangleWithDimensions.width);
		
		System.out.println("Rectangle's length: " + rectangleWithDimensions.getLength());
		
		// Changing this length does NOT change the value of my rectangle's length
		double length = rectangleWithDimensions.getLength();
		length++; // Add 1
		length *= 2; // Double
//		rectangleWithDimensions.length = 10.0; // Use the setter instead
		rectangleWithDimensions.setLength(10.0);
		System.out.println("Rectangle's length: " + rectangleWithDimensions.getLength());
		
		System.out.println("Rectangle's area: " + rectangleWithDimensions.getArea());
		rectangleWithDimensions.setWidth(1.0);
		System.out.println("Rectangle's area: " + rectangleWithDimensions.getArea()); // Changes area
		
		double area = rectangleWithDimensions.getArea();
		// double perimeter = (2 * rectangleWithDimensions.getLength()) + (2 * rectangleWithDimensions.getWidth());
		double perimeter = rectangleWithDimensions.getPerimeter();
		System.out.println(perimeter);
		
		System.out.println(Rectangle.SUM_OF_INTERIOR_ANGLES);
		System.out.println(Rectangle.INTERIOR_ANGLE);
	
		String[] classes = {"Math", "Biology", "Art", "US History", "Computer Science", "Statistics"};
		Student mark = new Student("Mark", "Wahlberg", "Georgia Tech", 4.0f, 1, classes);
		Student molly = new Student("Molly", "Johnson", "Stanford", 3.2f, 2, classes);
		// Student object allows to access all the data from one variable
		// Opposed to this below, where we have to keep track many many variables
//		String sallyFirstName = "Sally";
//		String sallyLastName = "Johsnon";
//		String sallySchoolName = "Stanford";
//		float sallyGpa = 3.2f;
//		int sallyId = 2;
		
		
		// Memory Address that points to the actual data
		
		String[] courses = mark.getCourses(); // C4
		
		courses = new String[5]; // This would change C4 -> B2
		
		System.out.println(courses == mark.getCourses()); // C4 == C4
		
		for (String course : courses) {
			System.out.println(course);
		}
		
		// Changing the courses array here also changes the courses array in my object
		courses[0] = "Calculus";
		float gpa = mark.getGpa();
		gpa = 2.0f;
		System.out.println("Mark's GPA after editing local variable: " + mark.getGpa());
		
		System.out.println("\n\nCourses after editing local variable courses: ");
		for (String course : mark.getCourses()) {
			System.out.println(course);
		}
		
		System.out.println(mark);
		// mark -> h18
		Student sally = mark; // Student Sally = H18
		sally.setFirstName("Sally");
		System.out.println("Mark's first name is now: " + mark.getFirstName());
		mark.setFirstName("Mark");
		
		System.out.println("Sally's first name is now: " + sally.getFirstName());
	
	}

}
