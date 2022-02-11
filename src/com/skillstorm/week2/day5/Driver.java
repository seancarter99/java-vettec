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
	
	public static void brakeEntity(Brakeable vehicle) {
		vehicle.brakeVehicle();
	}
	
	public static int calcSum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	public static void main(String[] args) {
//		Driveable drive = new Driveable(); // Cannot instantiate interface
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
		
	}

}
