package com.corejava;

import java.util.Scanner;

/**
 * This class is used for Calculator Example
 * @author Hasnain
 */

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double principle;
		double rate;
		double time;
		double emi;

		System.out.println("Enter Principle Amount");
		principle = scanner.nextFloat();

		System.out.println("Enter Rate: ");
		rate = scanner.nextFloat();

		System.out.println("Enter time: ");
		time = scanner.nextFloat();

		rate = rate / (12 * 100);
		time = time * 12;
		emi = (principle * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
		System.out.println("Monthly Emi is: " + emi + "\n");
	}

}