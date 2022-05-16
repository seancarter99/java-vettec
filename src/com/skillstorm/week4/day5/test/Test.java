package com.skillstorm.week4.day5.test;

class Dog {
	
}

class A {
    public void doA(int k) throws Exception {  // 0
        for(int i=0; i< 10; i++) {
            try {
            	if(i == k) throw new Exception("Index of k is "+i); // 1	
            } catch (Exception e) {
            }
        }
    }
    
    public void doB(boolean f) throws Exception { // 2
        if(f) {
            doA(15); // 3
        }
        else return;
    }
    
    public static void main(String[] args) throws Exception { // 4
        A a = new A();
        a.doB(args.length>0); // 5
    }
 }

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		int x = 5; // 5
		x = x + 5; // 10
		x++; // 11
		x += 5; // 16
		
		doSomething();
	}
	
	public static void doSomething() {
		int a = 1;
		Integer[] ia = new Integer[10];
		// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		
		int b = ia[a]; // b = 0
		ia[a] = 100;
		System.out.println("The value of b before mutating the array is: " + b);
		
		// {0, 100, 0, 0, 0, 0, 0, 0, 0, 0}
		b = ia[a]; // b = 100;
		
		int c = b + a; // c = 1
		System.out.println("The value of b used to be: " + b);
		System.out.println(b = c); // b = 1
		System.out.println("The value of b is now: " + b);
	}

	public String nameReverser(String name) {
		A a = new A();
		Car c = new Car();
		driveVehicle(c);
		
		return null;
	}
	
	public void driveVehicle(Driveable drive) {
		
	}
	
}

@FunctionalInterface
interface Driveable {
	void drive();
}

class Car implements Driveable {

	@Override
	public void drive() {
		System.out.println("Hello!");
	}
	
}
