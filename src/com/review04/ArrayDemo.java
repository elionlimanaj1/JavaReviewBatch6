package com.review04;

public class ArrayDemo {

	public static void main(String[] args) {
		// silly way
		int a0 = 5;
		int a1 = 7;
		int a2 = 8;
		int a3 = 9;
		int a4 = 20;
//		System.out.println(a0);
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);

		// 1st professional way
		// declaring an array, all elements have the default value
		int[] numbers = new int[5];

		// assigning values for array elements
		numbers[3] = 9;
		// re-assign
		// numbers[3] = 10;
		numbers[2] = 8;
		numbers[1] = 7;
		numbers[0] = 5;
		numbers[4] = 20;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		// printing the element with index 2, third element
		System.out.println("printing using index with variable");
		int index = 2;
		System.out.println(numbers[index]);
		index++;
		System.out.println(numbers[index]);

		int arrayLength = numbers.length;
		System.out.println("The length of the array is : " + arrayLength);

		// method a. using for loop
		// this method can iterate from start-point to end-point
		System.out.println("Reading from array using for loop");
		for (int j = 0; j < arrayLength; j++) {
			System.out.println(numbers[j]);
		}

		// method b. using for-each loop/advanced for loop/enhanced for loop
		// this method iterates the whole array
		System.out.println("Reading from array using for-each loop/advanced for loop/enhanced for loop");
		for (int number : numbers) {
			System.out.println(number);
		}

		// 2nd professional way of initializing array
		System.out.println("Second way uzing curly brackets");
		int[] numbers2 = { 4, 6, 8, 9, 15 };
		System.out.println("Length is " + numbers2.length);

		System.out.println("For Loop");
		for (int j = 0; j < numbers2.length; j++) {
			System.out.println(numbers2[j]);
		}

		System.out.println("Enhanced For Loop");
		for (int number : numbers2) {
			System.out.println(number);
		}
	}

}
