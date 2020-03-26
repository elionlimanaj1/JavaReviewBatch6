package com.review04;

public class ArrayMaxMin {
	// Find largest and smallest number in an array
	public static void main(String[] args) {
		int[] numbers = { 34, 67, 3, 93, 56, 72, 17, 33 };

		int largest = numbers[0];
		int smallest = numbers[0];
		int sum = 0;

		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}

			if (num < smallest) {
				smallest = num;
			}

			sum += num;
		}

		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The sum of all numbers is: " + sum);
	}
}
