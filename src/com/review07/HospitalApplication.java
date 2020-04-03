package com.review07;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor.hospitalName = "Hackensack Hospital"; // static variable can be assigned
		Doctor.payBills(); // static method can be called
		// Doctor.chargePatient(); // non-static is not allowed
		// because you have to create the object first

		Doctor doctor1;
		doctor1 = new Doctor("John Smith", "12345", 150000);

//		doc1.name = "John Smith";
//		doc1.licenceId = "12345";
//		doc1.salary = 150000;

		System.out.println("Doctor's name is " + doctor1.name);

		doctor1.displayInfo();
		doctor1.treatPatient("Adam Smith");

		Doctor doctor2 = new Doctor("Mehmet Oz", "34567", 400000);
		doctor2.displayInfo();

		Doctor doctor3 = new Doctor("Mary James", "68975", 500000, "123 Sessame St");
		doctor3.displayInfo();
		
		Dermatologist dermatologist1 = new Dermatologist("Tom Hanks", "7263", 30000, "D123");

		dermatologist1.chargePatient();
		dermatologist1.skinTest();
	}

	// HW for Ahmet,
	// Do singer
	// pop, rock, metal, rap

}
