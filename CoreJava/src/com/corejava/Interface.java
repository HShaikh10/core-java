package com.corejava;

/**
 * This class is used for Interface Example
 * @author Hasnain
 */

interface Drawable {
	
	/* static method for draw */
	void draw();
	
}

public class Rectangle implements Drawable {
	
	/* method for draw rectangle */
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}

public class Circle implements Drawable {
	
	/* method for draw circle */
	public void draw() {
		System.out.println("drawing circle");
	}
	
}

public class TestInterface1 {
	
	public static void main(String args[]) {
		Drawable drawable = new Circle();
		drawable.draw();
	}
	
}