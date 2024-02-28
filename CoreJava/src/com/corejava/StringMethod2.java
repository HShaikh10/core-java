package com.corejava;

/**
 * This class is used for String, Integer, Bigdecimal Example
 * @author Hasnain
 */

import java.math.BigDecimal;

public class StringMethod2 {

	public static void main(String[] args) {
		String s1 = "Radar";
		String s2 = "Column";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Integer i1 = 16;
		Integer i2 = 16;
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		BigDecimal decimal1 = new BigDecimal("10.10");
		BigDecimal decimal2 = new BigDecimal("20.00");

		System.out.println(decimal1 == decimal2);
		System.out.println(decimal1.equals(decimal2));

	}

}