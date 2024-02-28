package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is used for Collection List Iteraor Example
 * @author Hasnain
 */
public class CollectionListIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("$Test");
		list.add("Gujarat");

		Iterator<String> it = list.iterator();
		System.out.println(it.next());
	}

}