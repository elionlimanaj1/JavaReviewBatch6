package com.review01;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		System.out.println("The age is " + age);

		if (age <= 10) {
			System.out.println("You're too young my brother!");
		} else if (age <= 20) {
			System.out.println("You're growing body!");
		} else if (age <= 50) {
			System.out.println("You're the man!");
		} else {
			System.out.println("Man, you're dying!");
		}
	}

}
