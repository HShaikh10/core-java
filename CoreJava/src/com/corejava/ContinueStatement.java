package com.corejava;

/**
 * This class is used for Continue Statement
 * @author Hasnain
 */

public class ContinueStatement {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i == 7) {

				continue;
			}
			System.out.println(i);
		}
	}

}