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

class Main {

	public static void main(String[] args) {
		ArrayList<Sample> al = new ArrayList<Sample>();
		al.add(new Sample("Sample", 9, 2010));
		al.add(new Sample("Sample2", 10, 2005));

		Collections.sort(al);

		System.out.println("after sorting");

		for (Sample movie : al) {
			System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating() + " ");
		}

	}

}