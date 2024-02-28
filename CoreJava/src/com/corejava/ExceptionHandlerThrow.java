package com.corejava;

/**
 * This class is used for Exception Handler using Throw Example
 * @author Hasnain
 */

public class ExceptionHandlerThrow {

	class Test {
		
		/*
		 * Static method for Arithmetic Exception 
		*/
		
		static void avg() {
			try {
				throw new ArithmeticException("demo");
			} catch (ArithmeticException e) {
				System.out.println("Exception caught");
			}
		}

		public static void main(String args[]) {
			avg();
		}
	}

}