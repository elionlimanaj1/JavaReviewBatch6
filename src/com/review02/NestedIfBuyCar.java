package com.review02;

import java.util.Scanner;

public class NestedIfBuyCar {

	public static void main(String[] args) {

		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car. For those you can afford a new car there are different
		// price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"

		Scanner scan;
		int salary;

		System.out.println("Please enter your salary");

		scan = new Scanner(System.in);
		salary = scan.nextInt();

		String car1, car2, car3, car4;

		car1 = "Audi A5";
		car2 = "Mercedes-Benz";
		car3 = "Jaguar";
		car4 = "Tesla";

		if (salary > 50000) {
			System.out.println("You may buy a brand new car");
			if (salary >= 50000 && salary < 60000) {
				System.out.println("Save up money until next year");
			} else if (salary >= 60000 && salary < 70000) {
				System.out.println("With this salary you afford " + car1);
			} else if (salary >= 70000 && salary < 80000) {
				System.out.println("With this salary you afford " + car2);
			} else if (salary >= 80000 && salary < 90000) {
				System.out.println("With this salary you afford " + car3);
			} else if (salary >= 90000 && salary < 100000) {
				System.out.println("With this salary you afford " + car4);
			}
		} else {
			System.out.println("Sorry unfortunately you might want to buy a use car instead");
		}

		// 2nd way
//		if (salary > 50000) {
//			if (salary >= 60000) {
//				System.out.println("With this salary you afford " + car1);
//			} else if (salary >= 70000) {
//				System.out.println("With this salary you afford " + car2);
//			} else if (salary >= 80000) {
//				System.out.println("With this salary you afford " + car3);
//			} else if (salary >= 90000) {
//				System.out.println("With this salary you afford " + car4);
//			} else {
//				System.out.println("Save up money and wait until next year");
//			}
//		} else {
//			System.out.println("Sorry unfortunately you might want to buy a use car instead");
//		}
	}

}
