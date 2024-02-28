package com.corejava;

/**
 * This class is used for Hierarchy Inheritance Example 
 * @author Hasnain
 */

class Animal {

	/* Method for eat */
	
	void eat() {
		System.out.println("eating...");
	}

}

class Dog extends Animal {

	/* Method for bark */
	
	void bark() {
		System.out.println("barking...");
	}

}

class Cat extends Animal {

	/* Method for meow */
	
	void meow() {
		System.out.println("meowing...");
	}

}

class TestInheritance3 {
	public static void main(String args[]) {
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
	}

}