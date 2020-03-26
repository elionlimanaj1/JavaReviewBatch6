package com.review03;

public class WhileDemo {

	public static void main(String[] args) {
		String greeting = "Hello";
		int count = 1;

		// boolean condition = (count <= 5);

		while (count <= 5) {
			// count = count + 1;
			// count += 1;
			count++;
			System.out.println(greeting);
		}

		System.out.println("===========================");
		// reassigning count to 1
		count = 1;

		while (true) {
			count++;
			System.out.println(greeting);
			if (count == 6) {
				break;
			}
		}

	}

}
