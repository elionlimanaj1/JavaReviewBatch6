package com.review07;

public class Dermatologist extends Doctor {
	String dermaId;

	// super.name is same as this.name
	// super.chargePatient() is same as this.chargePatient()
	// But after overriding, they are NOT the same

	public Dermatologist(String name, String licenceId, int salary, String dermaId) {
		super(name, licenceId, salary);
		this.dermaId = dermaId;
	}

	public void skinTest() {
		System.out.println("Let's apply some skin test.");
	}

	// Method overriding
	public void chargePatient() {
		System.out.println("Let me charge $200.");
	}

}
