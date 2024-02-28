package com.corejava;

/**
 * This class is used for Super Keyword Example
 * @author Hasnain
 */
class Bird {

	/* method for bird sound */
	public void birdSound() {

		System.out.println("Bird make sound");
	}

}

class Pigeon extends Bird {

	/* method for bird sound using Super keyword */

	public void birdSound() {
		super.birdSound();
		System.out.println("Pigeon sound");
	}

}

public class SuperKeyword {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.birdSound();
	}

}