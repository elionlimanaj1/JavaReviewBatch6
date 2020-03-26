package com.review03;

public class ContinueDemo {
	// I want to celebrate my son's 20 birthdays
	// but not 13th birthday
	// Let's use for loop
	public static void main(String[] args) {
//		int age = 0;
//		while (age < 10) {
//			age++;
//			System.out.println("Happy birthday! You are " + age + " years old.");
//		}
//		System.out.println("Now you are grown! You don't need a birthday celebration.");

		for (int age = 1; age <= 20; age++) {
			// 1st way without continue
//			if (age != 13) {
//				System.out.println("Happy birthday! You are " + age + " years old.");
//			}

			// 2nd way without continue
//			if (age == 13) {
//
//			} else {
//				System.out.println("Happy birthday! You are " + age + " years old.");
//			}

			// 3rd way with continue
			if (age == 13) {
				continue;
			}
			System.out.println("Happy birthday! You are " + age + " years old.");
		}
	}
}
