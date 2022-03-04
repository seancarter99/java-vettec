package com.skillstorm.week5.day5.functionalinterface;

public class FindBiggestInteger implements FindBiggest<Integer> {

	@Override
	public Integer compare(Integer item1, Integer item2, Integer item3) {
		if (item1 < item2) {
			if (item2 < item3) {
				return item3;
			} else {
				return item2;
			}
		} else {
			if (item1 > item3) {
				return item1;
			} else {
				return item3;
			}
		}
	}

	@Override
	public String toString() {
		return "Hello!";
	}
}
