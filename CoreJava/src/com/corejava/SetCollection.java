package com.corejava;

import java.util.HashSet;

/**
 * This class is used for Set Collection Example
 * @author Hasnain
*/

public class SetCollection {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("BMW");
		hashSet.add("Volvo");
		hashSet.add("Mazda");
		hashSet.add("Volvo");
		hashSet.add("Ford");

		System.out.println(hashSet);

	}

}