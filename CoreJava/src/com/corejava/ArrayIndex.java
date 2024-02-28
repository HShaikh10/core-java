package com.corejava;

import java.util.Scanner;

/**
 * This class is used for Array Index Number
 * @author Hasnain
 */

public class ArrayIndex {

	/* Static method for index number with parameters */

	public static int IndexNumber(int array[], int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int IndexNumber=sc.nextInt();
		int array[] = { 1, 2, 3, 4, 5, 6 };
		int element = 2;
		int index = IndexNumber(array, element);
		System.out.println(array);
	}

}