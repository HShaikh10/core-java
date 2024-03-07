package com.corejava;

/**
 * This class is used for Map Collection Example
 * @author Hasnain
*/

public class Animal {
	
	/* method for eat */	
	void eat() {
		System.out.println("eating...");
	}
	
}

public class Dog extends Animal {
	
	/* method for bark */	
	void bark() {
		System.out.println("barking...");
	}
	
}

public class BabyDog extends Dog {
	
	/* method for weep */	
	void weep() {
		System.out.println("weeping...");
	}
	
}

public class TestInheritance2 {
	
	public static void main(String args[]) {
		BabyDog babyDog = new BabyDog();
		babyDog.weep();
		babyDog.bark();
		babyDog.eat();
	}
	
}