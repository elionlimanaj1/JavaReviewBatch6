package com.review02;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Are you a boy or a girl?");
		String boyGirl = input.next();

		System.out.println("Are you rich true/false?");
		boolean rich = input.nextBoolean();

		System.out.println("You are a " + boyGirl + " and you are rich: " + rich);

		if (boyGirl.equals("boy")) {
			// boy
			System.out.println("Yaaaaay");
			if (rich) {
				// rich boy
				System.out.println("Buy a ferrari.");
			} else {
				// poor boy
				System.out.println("Play sports");
			}
			
//			Extra check
//			System.out.println("How old are you?");
//			int age = input.nextInt();
//			if (age > 20) {
//				System.out.println("you should marry");
//			} else {
//				System.out.println("you should study");
//			}
		} else if (boyGirl.equals("girl")) {
			// girl
			System.out.println("Yay");
			if (rich) {
				// rich girl
				System.out.println("Buy Louis Vuitton");
			} else {
				// poor girl
				System.out.println("Read a book");
			}
		} else {
			// neither boy or girl
			System.out.println("You entered a wrong choice.");
		}

		System.out.println("We are done.");

	}

}
