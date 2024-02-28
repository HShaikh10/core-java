package com.corejava;

/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */

class Animal {
	
	/* eat method for eating */
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {

	/* eat method for barking */
	
	void bark() {
		System.out.println("barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	}
	
}