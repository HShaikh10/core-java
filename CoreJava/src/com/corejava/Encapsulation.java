package com.corejava;

/**
 * This class is used for Encapsulation Example
 * @author Hasnain
 */

public class Encapsulation {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Test {
	public static void main(String[] args) {

		Student student = new Student();
		student.setName("vijay");
		System.out.println(student.getName());
	}
	
}