package com.review06;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;

	public void walk() {
		System.out.println("Crawling...");
	}

	protected String cry() {
		return "Cry every minute....";
	}

	void talk(int times) {
		for (int i = 1; i <= times; i++) {
			System.out.print("Bla ");
		}
	}

	public void displayBabyInfo() {
		System.out.println("Full name of baby is " + this.firstName + " " + this.lastName);
		System.out.print("Gender is ");
		if (gender == 'M') {
			System.out.println("Boy");
		} else if (gender == 'F') {
			System.out.println("Girl");
		} else {
			System.out.println(" unknown");
		}

		System.out.println("Hair color is " + hairColor);
	}

}