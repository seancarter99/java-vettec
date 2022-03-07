package com.skillstorm.week6.day1;

import com.skillstorm.week5.day5.Action;

public class Review {
	
	int y, x;
	
	public Review(int y, int x) {
		this.y = y;
		this.x = x;
	}

	public static void performAction(int[] nums, Action action) {
		for (int num : nums) {
			action.act(num);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {5, 3, 2, 5, 6, 10};
		performAction(nums, (num) -> num);
		System.out.println();
		
		performAction(nums, num -> {
			num *= 3;
			System.out.println(num);
			return num;
		});
		
		System.out.println();
		
		performAction(nums, 
				num -> { 
					return num / 2;
				}
		);
		
		// Declare a variable x of type int
		int x;
		
		// Variable assignment is giving a variable a value
		x = 5;
	}

}
