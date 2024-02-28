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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		sc.close();
	}

	/**
	 *The add method do addition on variable a and b 
	 **/
	void add() {
		total = a + b;
	}

	/**
	 *The add method display addition of variable a and b 
	 **/
	void display() {
		System.out.println("Total of a and b is: " + total);
	}

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		obj.add();
		obj.display();
	}

}