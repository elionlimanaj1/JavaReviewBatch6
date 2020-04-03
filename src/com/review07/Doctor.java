package com.review07;

public class Doctor {
	String name;
	String licenceId;
	int salary;

	public Doctor(String name, String licenceId, int salary) {
		this.name = name;
		this.licenceId = licenceId;
		this.salary = salary;
	}

	public void checkUp(String patientName) {
		System.out.println("Doctor " + name 
				+ " has ordered blood test for " 
				+ patientName);
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
		System.out.println("Doctor " + name + " with licenceId " + licenceId + " has a salary " + salary);
	}

}
