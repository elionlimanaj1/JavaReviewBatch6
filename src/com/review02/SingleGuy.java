package com.review02;

import java.util.Scanner;

public class SingleGuy {
	// He want to marry if she is beautiful or rich
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hey girl!");
		System.out.println("Are you beautiful true/false?");
		boolean beautiful = input.nextBoolean();

		System.out.println("Are you rich true/false?");
		boolean rich = input.nextBoolean();

		if (beautiful || rich) {
			System.out.println("The student will marry you!");
		} else {
			// ugly poor lady
			System.out.println("Are you a good person true/false?");
			boolean good = input.nextBoolean();
			if (good) {
				System.out.println("The student will give you a chance!");
			} else {
				System.out.println("Sorry, you are in a bad situation!");
			}
		}

	}

}
