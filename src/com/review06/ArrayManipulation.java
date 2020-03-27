package com.review06;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 6, 1, 8 };
		
		double avg = findAverage(arr);
		System.out.println("average is " + avg);

		ArrayManipulation manip = new ArrayManipulation();

		int largest = manip.largestNumber(arr);
		System.out.println("largest is " + largest);

		System.out.println("smallest is " + manip.smallestNumber(arr));	

		// HW
		// create a method that returns sum of an array
	}

	public int largestNumber(int[] array) {
		int largest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		return largest;
	}

	int smallestNumber(int[] array) {
		int smallest = array[0];
		for (int num : array) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}

	//even if it is private it can be called from inside the class.
	private static double findAverage(int[] array) {
		double sum = 0;

		for (int num : array) {
			sum += num;
		}

		return sum / array.length;
	}

}
