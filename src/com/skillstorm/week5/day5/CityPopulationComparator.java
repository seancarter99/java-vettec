package com.skillstorm.week5.day5;

import java.util.Comparator;

import com.skillstorm.week4.day4.City;

public class CityPopulationComparator implements Comparator<City> {

	@Override
	public int compare(City city1, City city2) {
		if (city1 == null) {
			if (city2 == null) {
				return 0;
			}
			return 1;
		}
		
		if (city1.getPopulation() < city2.getPopulation()) {
			return -1;
		} else if (city1.getPopulation() == city2.getPopulation()) {
			return 0;
		} else {
			return 1;
		}
	}

}
