package com.corejava;

/**
 * This class is used for Parameterized COnstructor Example 
 * @author Hasnain
 */
public class ParametarizedConstructor {

	String cities;

	/* Parameterized Constructor */
	public ParametarizedConstructor(String c) {
		cities = c;
		System.out.println("Cities: " + c);
	}

	public static void main(String[] args) {

		ParametarizedConstructor c1 = new ParametarizedConstructor("Ahmedabad");
		ParametarizedConstructor c2 = new ParametarizedConstructor("Baroda");
	}

}