package com.corejava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class is used for Duplicate element in List Example
 * @author Hasnain
 */

public class ListDuplicate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("B");

		System.out.println(list.toString());
		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
	}

}