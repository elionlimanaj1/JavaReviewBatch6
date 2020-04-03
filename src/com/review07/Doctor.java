package com.review07;

public class Doctor {
	static String hospitalName;
	String name;
	String licenceId;
	int salary;

	// one more variable added
	String address;

//	public Doctor() {
//		//super();
//	}

	public Doctor(String name, String licenceId, int salary) {
		// super(); // I am calling super() by default
		this.name = name;
		this.licenceId = licenceId;
		this.salary = salary;
		System.out.println("This is for Tugba");
	}

	public Doctor(String name, String licenceId, int salary, String address) {
		this(name, licenceId, salary);
		this.address = address;
	}

	public void checkUp(String patientName) {
		System.out.println("Doctor " + name + " has ordered blood test for " + patientName);
	}

	public void treatPatient(String patientName) {
		checkUp(patientName);
		System.out.println("Doctor " + this.name + " gives prescription to " + patientName);
		this.chargePatient();
	}

	public void chargePatient() {
		System.out.println("Let me charge $100.");
	}

	public void displayInfo() {
		System.out.println("Doctor " + name + " with licenceId " + licenceId + " has a salary " + salary + " works for "
				+ hospitalName);
	}

	public static void payBills() {
		// non-static variables cannot be used
		// System.out.println("Doctor " + name);

		// static variables can be used
		System.out.println("Everybody pays bills in " + hospitalName);
	}

}
