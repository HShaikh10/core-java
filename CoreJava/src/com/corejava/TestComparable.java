package com.corejava;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is used for Comparable Example
 * @author Hasnain
 */

class Sample implements Comparable<Sample> {

	private double rating;
	private String name;
	private int year;

	/* method for compare variable */
	public int compareTo(Sample m) {
		return this.year - m.year;
	}

	/* method for compare variables */
	public Sample(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;

	}

}

public class Main {

	public static void main(String[] args) {
		ArrayList<Sample> arrayList = new ArrayList<Sample>();
		arrayList.add(new Sample("Sample", 9, 2010));
		arrayList.add(new Sample("Sample2", 10, 2005));

		Collections.sort(arrayList);

		System.out.println("after sorting");

		for (Sample movie : arrayList) {
			System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating() + " ");
		}

	}

}