package com.corejava;

import java.util.Scanner;

/**
 * This class is used for Constructor
 * @author Hasnain
 */

public class ConstructorExample {

	int a;
	int b;
	int total;

	public ConstructorExample() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		a = scanner.nextInt();

		System.out.println("Enter Second Number: ");
		b = scanner.nextInt();
		scanner.close();
	}

	/* The add method do addition on variable a and b */
	public void add() {
		total = a + b;
	}

	/*  The add method display addition of variable a and b */
	public void display() {
		System.out.println("Total of a and b is: " + total);
	}

	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample();
		constructorExample.add();
		constructorExample.display();
	}

}