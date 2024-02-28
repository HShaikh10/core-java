package com.corejava;

import java.util.HashSet;

/**
 * This class is used for Set Collection Example
 * @author Hasnain
 */

public class SetCollection {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("BMW");
		set.add("Volvo");
		set.add("Mazda");
		set.add("Volvo");
		set.add("Ford");

		System.out.println(set);

	}

}