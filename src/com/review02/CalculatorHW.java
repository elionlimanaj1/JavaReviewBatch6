package com.review02;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
//		String name1 = new String("John");
//		String name2 = new String("John");
//		System.out.println(name1.equals(name2));
//		System.out.println(name1 == name2);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter in First Number: ");
		int num1 = scan.nextInt();

		System.out.print("Enter in Operator : ");
		String operator = scan.next();

		System.out.print("Enter in Second Number: ");
		int num2 = scan.nextInt();

		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operator.equals("/")) {
			System.out.println(num1 / num2);
		} else if (operator.equals("*")) {
			System.out.println(num1 * num2);
		} else {
			System.out.println("Invalid Operator or number entered");
		}

	}
}
