package com.review01;

public class IfElseDemo {

	public static void main(String[] args) {

		boolean tired = false;
//Be careful with curly brackets, if you open, you have to close
//		if (tired) 
//			System.out.println("Ali is tired");
//		System.out.println("Ali goes to bed");
//		else
//			System.out.println("Ali is strong");

		if (tired) {
			System.out.println("Go to sleep!");
			System.out.println("Don't forget to wake up!");
		} else {
			System.out.println("Study more!");
			System.out.println("Continue studying!");
		}

		System.out.println("-------------------");
		System.out.println("Let's print the bigger number");
		int number1 = 14;
		int number2 = 10;

		if (number1 > number2) {
			System.out.println("number1 is bigger, the value is " + number1);
		} else if (number2 > number1) {
			System.out.println("number2 is bigger, the value is " + number2);
		} else {
			System.out.println("number1 and number2 are equal, the value is " + number1);
		}

		System.out.println("Let's do it Bayramgul's way");

		if (number1 > number2) {
			System.out.println("number1 is bigger, the value is " + number1);
		}
		if (number2 > number1) {
			System.out.println("number2 is bigger, the value is " + number2);
		} else {
			System.out.println("number1 and number2 are equal, the value is " + number1);
		}
	}
}
