package com.skillstorm.week1.day3;

public class Exercise {

	public static int calcSum(int x, int y) {
		return x + y;
	}
	
	/*
	 * What disqualifies someone from joining?
	 * 
	 * Age range? 18+
	 * If they have felonies are they out?
	 * BMI range? Must 18 - 22 %
	 */
	public static boolean canEnterMilitary(int age, boolean hasFelonies, double bodyFatPercent) {
		if (age < 18) {
			return false; // Can't enter
		}
		if (hasFelonies) {
			return false;
		}
		if (bodyFatPercent < 18 || bodyFatPercent > 22) {
			return false;
		}
		return true; // Can enter
	}
	
	public static void main(String[] args) {
		int sum = calcSum(2, 5);
		
		if (canEnterMilitary(18, true, 20)) {
			System.out.println("Can enter!");
		} else {
			System.out.println("Can't enter!");
		}
	}
}
