package com.review04;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		// 1st way of creating 2d-array
		int[][] numbers = new int[2][3];

		// enter into array. into row index 0 and column index 2
		numbers[0][2] = 8;
		numbers[0][0] = 5;
		numbers[1][0] = 9;
		numbers[0][1] = 6;
		numbers[1][1] = 2;
		numbers[1][2] = 3;

		// 2nd way of creating 2d-array
		int[][] numbers2 = { { 5, 6, 8 }, { 9, 2, 3 } };

		System.out.println("Let's get some values from numbers2");
		// first get it, then print it
		int value = numbers2[1][0];
		System.out.println(value);

		// get and print in one step
		System.out.println(numbers2[1][1]);

		// 1d-array is married to for loop
		// 2d-array is married to nested for loop

		// how many rows?
		int rows = numbers2.length;
		// how many columns in first row?
		int columns = numbers2[0].length;

		for (int row = 0; row < numbers2.length; row++) {
			System.out.println("I am in the " + row + " row");
			for (int col = 0; col < numbers2[row].length; col++) {
				System.out.print("I am in column " + col);
				System.out.println(" The value is " + numbers2[row][col]);
			}
			System.out.println();
		}
	}

}
