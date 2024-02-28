package com.corejava;

/**
 * This class is used for Interface Example
 * @author Hasnain
 */

interface Drawable {
	
	/* static method for draw */
	
	void draw();
}

class Rectangle implements Drawable {
	
	/* method for draw rectangle */
	
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	
	/* method for draw circle */
	
	public void draw() {
		System.out.println("drawing circle");
	}
}

class TestInterface1 {
	public static void main(String args[]) {
		Drawable d = new Circle();
		d.draw();
	}
}