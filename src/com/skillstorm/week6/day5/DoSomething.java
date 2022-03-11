package com.skillstorm.week6.day5;

public class DoSomething implements Action {

	@Override
	public void act(int num) {
		System.out.println(num * 2);
	}
}
