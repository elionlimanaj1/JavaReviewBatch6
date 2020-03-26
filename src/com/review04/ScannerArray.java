package com.review04;

import java.util.Scanner;

public class ScannerArray {
	// Use scanner to ask for the size of the array
	// Then, read numbers from the scanner into the array
	// Then print the whole array

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements do you want to store, buddy?");
		int size = scan.nextInt();

		// I am creating an array with size = whatever he/she gave us
		int[] nums = new int[size];

		// This for loop inserts numbers into array
		for (int i = 0; i < size; i++) {
			System.out.println("Give me a number to store in the array!");
			nums[i] = scan.nextInt();
		}

		System.out.println("Let's see what you gave me:");
		// This enhanced for loop reads numbers from the array
		for (int n : nums) {
			System.out.println(n);
		}

	}
}
