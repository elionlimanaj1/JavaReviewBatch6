package com.review05;

import java.util.Arrays;

public class Q7 {
	// Write a java program to find the second largest number in the array?
	// Maximum and minimum number in the array?
	public static void main(String[] args) {

		int[] numbers = { 32, 61, 16, 89, 74, 25 };

		// 1st way
		Arrays.sort(numbers);
		System.out.println("Smallest " + numbers[0]);
		System.out.println("Biggest " + numbers[numbers.length - 1]);
		System.out.println("Second Largest " + numbers[numbers.length - 2]);

		// 2nd way
		System.out.println("---2nd way---");
		int[] numbers2 = { 32, 61, 16, 89, 74, 25 };

		int smallest = numbers2[0];
		int largest = numbers2[0];
		int largest2 = numbers2[0];

		for (int i = 1; i < numbers2.length; i++) {
			int element = numbers2[i];
			// check if it is bigger than the largest
			if (element > largest) {
				largest2 = largest;
				largest = element;
			} else if (element > largest2) { // check if it is bigger than second largest
				largest2 = element;
			}
			
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Biggest " + largest);
		System.out.println("Second Largest " + largest2);

	}

}
