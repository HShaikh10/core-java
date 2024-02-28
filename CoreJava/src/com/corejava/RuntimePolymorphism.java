package com.corejava;

/**
 * This class is used for Map Collection Example
 * @author Hasnain
 */

class Shape {
	
	/* draw method for drawing */
	
	void draw() {
		System.out.println("drawing...");
	}
	
}

class Rectangle extends Shape {
	
	/* draw method for drawing rectangle */
	
	void draw() {
		System.out.println("drawing rectangle...");
	}
	
}

class Circle extends Shape {
	
	/* draw method for drawing circle */
	
	void draw() {
		System.out.println("drawing circle...");
	}
	
}

class Triangle extends Shape {
	
	/* draw method for drawing triangle */
	
	void draw() {
		System.out.println("drawing triangle...");
	}
	
}

class TestPolymorphism2 {
	public static void main(String args[]) {
		Shape shape;
		shape = new Rectangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}
	
}