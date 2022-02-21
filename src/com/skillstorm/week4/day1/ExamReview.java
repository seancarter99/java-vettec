package com.skillstorm.week4.day1;

import java.util.ArrayList;

public class ExamReview {
	
	public static void doStuff() {
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 100; j++) {
				System.out.println("The value of i is: " + i);
				System.out.println("The value of j is: " + j);
				System.out.println();
			}
			try {
				int answer = 5 / 0;
				System.out.println(answer);
			} catch (Exception e) {
				System.out.println("An exception was caught!");
			}
			
		
		}
		int[] myNum = new int[5];
		System.out.println(myNum);
		
		myNum[4] = 234;
		
		System.out.println(myNum[4]);
		ArrayList<Integer> arrL = new ArrayList<>();
		ArrayList<ExamReview> arrList = new ArrayList<>();
		String[] stringArr = new String[10];
		
		
//		System.out.println(arrL[0]); // This does not work
//		System.out.println(arrL.get(0)); // This works for array lists
		System.out.println(stringArr[0]);
		
		Math.sqrt(-2);
	}

}
