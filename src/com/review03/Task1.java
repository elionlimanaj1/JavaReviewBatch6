package com.review03;

public class Task1 {
	// print number from 15 to 35
	// but don't print numbers that are divisible by both 2 and 3, at the same time

	public static void main(String[] args) {

		for (int i = 15; i <= 35; i++) {

			// 1st way, divisible by 6
//			if (i % 6 == 0) {
//				continue;
//			}
//			System.out.println(i);

			// 2nd way, using &&
//			if (i % 2 == 0 && i % 3 == 0) {
//				continue;
//			}
//			System.out.println(i);

			// 3rd way, using ||
			if (i % 2 != 0 || i % 3 != 0) {
				System.out.println(i);
			}
		}
	}
}
