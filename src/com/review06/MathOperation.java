package com.review06;

public class MathOperation {

	// can be accessed from everywhere
	public int add(int num1, int num2) {
		int addition = num1 + num2;
		return addition;
	}

	// can be accessed from inside package, and inheritance
	protected void addNoReturn(int num1, int num2) {
		int addition = num1 + num2;
		System.out.println("Printing the result " + "inside the method " + addition);
	}

	// can be accessed from inside package
	int multiply(int num1, int num2) {
		return num1 * num2;
	}

	// can be accessed only within this class
	private void smth() {

	}

}
