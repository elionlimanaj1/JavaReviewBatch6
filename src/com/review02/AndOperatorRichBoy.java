package com.review02;

import java.util.Scanner;

public class AndOperatorRichBoy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Are you a boy or a girl?");
		String boyGirl = input.next();

		System.out.println("Are you rich true/false?");
		boolean rich = input.nextBoolean();

		System.out.println("You are a " + boyGirl + " and you are rich: " + rich);

		if (boyGirl.equals("boy") && rich) {
			// only if rich boy
			System.out.println("Buy a ferrari.");
		} else if (boyGirl.equals("boy") && !rich) {
			// only poor boy
			System.out.println("Play sports");
		} else if (boyGirl.equals("girl") && rich) {
			// only rich girl
			System.out.println("Buy Louis Vuitton");
		} else if (boyGirl.equals("girl") && !rich) {
			// only poor girl
			System.out.println("Read a book");
		} else {
			// neither boy or girl
			System.out.println("You entered a wrong choice.");
		}

//		if (!boyGirl.equals("boy")) {
//			// ! means the opposite of the result
//		}
//		
//		if (rich) {
//			//only if rich is true
//		}
//		
//		if (!rich) {
//			//only if rich is false
//		}

//		if (boyGirl.equals("boy") && !rich) {
//			// only if is a boy and not rich
//			System.out.println("only if is a boy and not rich");
//		}
//
//		if (!boyGirl.equals("boy") && rich) {
//			// only if it is not a boy and it is rich
//			System.out.println("only if it is not a boy and it is rich");
//		}
//
//		if (!(boyGirl.equals("boy") && rich)) {
//			// only if it is not (rich boy)
//			System.out.println("only if it is not (rich boy)");
//		}
	}
}
