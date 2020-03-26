package com.review03;

public class SumEvenForLoop {
	// Add Even numbers
	// Also add Odd numbers
	// Also add All numbers
	// Between 1 && 50
	// Using for loop
	public static void main(String[] args) {
		int totalOdd = 0, totalEven = 0, grandTotal = 0;

		for (int count = 1; count <= 50; count++) {
			if (count % 2 == 0) {
				totalEven += count;
			} else {
				totalOdd += count;
			}
			// 2nd way to calculate grandTotal
			grandTotal += count;
		}
		System.out.println("totalEven is = " + totalEven);
		System.out.println("totalOdd is = " + totalOdd);

		// 1st way to calculate grandTotal
		// grandTotal = totalEven + totalOdd;
		System.out.println("grandTotal is = " + grandTotal);
	}

}
