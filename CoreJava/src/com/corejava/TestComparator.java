package com.corejava;

/**
 * This class is used for Comparator Example
 * @author Hasnain
 */
import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Ahmedabad");
		list.add("Delhi");
		list.add("Udaypur");

		Collections.sort(list);
		System.out.println("List is sorted in reversed order");

		System.out.println(list);

	}

}