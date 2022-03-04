package com.skillstorm.week2.day5;

public class Driver {

	/*
	 * driveEntity takes in a Driveable object and uses its driveVehicle method
	 * 
	 * The fact that the parameter is Driveable and not something specific like Bicycle has pros and cons
	 * 
	 * Pros: 
	 * - Allows our function to be more flexible in what it takes in (Bikes, Horses, Scooters)
	 * - Functional, since we're only using the driveVehicle method and we know that's what all Driveables can do
	 * 
	 * Cons:
	 * - We're limited in what we can do with this object
	 * - We can only do things a Driveable can do as opposed to everything else something like a 
	 *   bike can do (brake, access bike properties)
	 */
	public static void driveEntity(Driveable methodOfTransport) {
		if (methodOfTransport == null) {
			return;
		}
		// vehicle can be anything so long as it implements the driveable interface
		// I know for sure at this point that calling this method is safe, because every Driveable object
		// MUST have driveVehicle implemented
		methodOfTransport.driveVehicle();
	}
	
	
	/*
	 * This is runtime polymorphism
	 * 
	 * Compile time polymorphism is the overloading of functions
	 * Runtime polymorphism is passing objects of different data types and acting on them altogether
	 */
	public static void brakeEntity(Brakeable vehicle) {
		vehicle.brakeVehicle();
	}
	
	public static void brakeEntity() {
		System.out.println("Slightly different brakeFunction()");
	}
	
	public static void main(String[] args) {
		// Instantiate means to create an instance of a class
//		Driveable drive = new Driveable(); // Cannot instantiate interface
//		Shape shape = new Shape(); // Cannot instantiate abstract class
		Driveable.sayHello();
		
		Bicycle bike = new Bicycle();
		// Since Bicycle is a Driveable I can do this instead
		Driveable bicycle = new Bicycle();
//		bicycle.brakeVehicle(); // This doesn't work, because just because it's driveable doesn't mean it's brakeable
		Driveable bike2 = new CrappyBicycle();
		// Doesn't work because I tried to cast a crappy bike that can't brake into something that can brake
//		((Brakeable) bike2).brakeVehicle();
		
		bike.setColor("blue");
		driveEntity(bike);
		brakeEntity(bike);
		brakeEntity();
		
		CrappyBicycle crappyBike = new CrappyBicycle();
		driveEntity(crappyBike); // This is allowed since my crappyBike IS a driveable object
//		brakeEntity(crappyBike); // This does not work because my crappyBike is NOT a brakable object
//		int sum = calcSum(2, 3);
//		System.out.println(sum);
		
		Horse silver = new Horse();
		Scooter scooter = new Scooter();
		driveEntity(silver);
		driveEntity(scooter);
		driveEntity(null);
		
		Driveable[] myGarage = new Driveable[10];
		myGarage[0] = bike;
		myGarage[1] = new Bicycle();
		myGarage[2] = crappyBike;
		myGarage[3] = silver;
		myGarage[4] = scooter;
//		myGarage[5] = "apple";
//		myGarage[6] = 10.4f;
//		myGarage[7] = true;
//		myGarage[8] = 'l';
		
		// Polymorphism
		// Since they're Shapes, I can use getArea
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Square(10);
		shapes[1] = new Circle(5);
		shapes[2] = new Triangle(10, 5);
		shapes[3] = new Triangle(2, 4);
		shapes[4] = new Square(6);
		
		System.out.println("Printing the shapes array: \n\n");
		for (Shape shape : shapes) {
			System.out.println("The type of shape this is: " + shape.getType());
			System.out.println("The area of this shape is: " + shape.getArea());
			System.out.println();
		}
		
		driveEntity(() -> System.out.println("Driving my Lambda"));
	}

}
