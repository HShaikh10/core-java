package com.corejava;

import java.util.HashMap;

/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */

public class MapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();

		capitalCities.put(1, "London-England");
		capitalCities.put(2, "Washington-USA");
		capitalCities.put(3, "Delhi-India");
		capitalCities.put(4, "Berlin-Germany");

		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		System.out.println(capitalCities);

	}

}