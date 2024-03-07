package com.corejava;

/**
 * This class is used for String, Integer, Bigdecimal Example
 * @author Hasnain
*/

import java.math.BigDecimal;

public class StringMethod2 {

	public static void main(String[] args) {
		String string1 = "Radar";
		String string2 = "Column";

		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));

		Integer integer1 = 16;
		Integer integer2 = 16;
		System.out.println(integer1 == integer2);
		System.out.println(integer1.equals(integer2));

		BigDecimal bigDecimal1 = new BigDecimal("10.10");
		BigDecimal bigDecimal2 = new BigDecimal("20.00");

		System.out.println(bigDecimal1 == bigDecimal2);
		System.out.println(bigDecimal1.equals(bigDecimal2));

	}

}