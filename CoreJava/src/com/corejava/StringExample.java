package com.corejava;

/**
 * This class is used for String Example Example
 * @author Hasnain
 */

public class StringExample {

	public static void main(String[] args) {
		String str = "User";
		String str2 = "Test";

		System.out.println(str.concat(str2));
		System.out.println(str.equals(str2));
		System.out.println(str.charAt(2));
		System.out.println(str.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str.compareTo(str2));
		System.out.println(str2.length());
		System.out.println(str.split(str2));
	}

}