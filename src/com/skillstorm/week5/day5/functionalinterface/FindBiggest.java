package com.skillstorm.week5.day5.functionalinterface;

@FunctionalInterface
public interface FindBiggest<T> {

	T compare(T item1, T item2, T item3);
	
}
