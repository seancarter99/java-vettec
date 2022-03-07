package com.skillstorm.week5.day5;

/*
 * In order to create Lambdas, I first need a functional interface
 * 
 * A functional interface is an interface that has one and ONLY one abstract method
 * 
 * A best practice is to annotate our interfaces with @FunctionalInterface to enforce this behavior
 * 
 * This works the same was as @Override
 */
@FunctionalInterface
public interface Action {

	int act(int num);

}
