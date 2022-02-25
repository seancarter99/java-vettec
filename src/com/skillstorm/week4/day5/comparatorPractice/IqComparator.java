package com.skillstorm.week4.day5.comparatorPractice;

import java.util.Comparator;

public class IqComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getIq() - o2.getIq();
	}

}
