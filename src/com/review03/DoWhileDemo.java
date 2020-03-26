package com.review03;

public class DoWhileDemo {

	public static void main(String[] args) {

		// Similarity between while && do-while
		int age = 0; // just born

		while (age < 10) {
			age++;
			System.out.println("Happy birthday! You are " + age + " years old.");
		}
		System.out.println("Now you are grown! You don't need a birthday celebration.");

		int age2 = 0; // just born my second son
		do {
			age2++;
			System.out.println("Happy birthday! You are " + age2 + " years old.");
		} while (age2 < 10);
		System.out.println("Now you are grown! You don't need a birthday celebration.");

		// Difference between while && do-while
		String greeting = "Hi";
		boolean happy = false;
		while (happy) {
			System.out.println(greeting + " inside while");
		}

		do {
			System.out.println(greeting + " inside do-while");
		} while (false);

	}

}
