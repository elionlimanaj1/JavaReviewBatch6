package com.review01;

public class MathTask {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 2;

		int sum = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;

		System.out.println("number1 is " + number1);
		System.out.println("number2 is " + number2);
		System.out.println("The sum is not " + number1 + number2);
		System.out.println("The sum is " + (number1 + number2));

		System.out.println();
		System.out.println("The sum is " + sum);
		System.out.println("The subtraction is " + subtraction);
		System.out.println("The multiplication is " + multiplication);
		System.out.println("The division is " + division);

		System.out.println("------------------");
		int result = 29 / 10; // 2.9
		System.out.println("The result of division is " + result);

		int mod = 29 % 10;
		System.out.println("The remainder of division is " + mod);

		double doubleResult = 29 / 10;
		System.out.println("The doubleResult of division is " + doubleResult);

		double doubleResult2 = 29.0 / 10.0;
		System.out.println("The doubleResult2 of division is " + doubleResult2);
		
	}

}
