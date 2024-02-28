package com.corejava;

/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */

class Animal {
	/* method for eat */
	void eat() {
		System.out.println("eating...");
	}
	
}

class Dog extends Animal {
	/* method for bark */
	void bark() {
		System.out.println("barking...");
	}
	
}

class BabyDog extends Dog {
	/* method for weep */
	void weep() {
		System.out.println("weeping...");
	}
	
}

class TestInheritance2 {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
	
}