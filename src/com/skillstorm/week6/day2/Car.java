package com.skillstorm.week6.day2;

import java.util.HashMap;

public enum Car {
	RED,
	BLUE,
	GREEN,
	GRAY,
	BLACK;
	
	private HashMap<Color, String> hexCodeMap;
	
	String get(Color color) {
		return hexCodeMap.get(color);
	}
	
	void put(Color color, String hexCode) {
		hexCodeMap.put(color, hexCode);
	}
}
