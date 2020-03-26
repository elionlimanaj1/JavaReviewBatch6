package com.review02;

import java.util.Scanner;

public class NestedIfCardBalance {
	
	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * 
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off otherwise you can tell them that they can spend more
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc = input.nextBoolean();
		if (cc == true) {
			System.out.println("What is the balance on your card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off your balance");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to apply for credit card");
		}
	}

}
