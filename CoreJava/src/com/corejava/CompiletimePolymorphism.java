package com.corejava;

/**
 * This class is used for Compile time Polymorphism Example
 * @author Hasnain
 */
public class CompiletimePolymorphism {

	public static void main(String args[]) {
		CompileTimePloymorphismExample obj = new CompileTimePloymorphismExample();
		obj.display();
		obj.display("Polymorphism");
	}

}

class CompileTimePloymorphismExample {

	/*
	 * The display method is used for without parameter example
	 */
	void display() {
		System.out.println("In Display without parameter");
	}

	/*
	 * The display method is used for with parameter example
	 */
	void display(String value) {
		System.out.println("In Display with parameter" + value);
	}

}