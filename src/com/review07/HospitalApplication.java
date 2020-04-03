package com.review07;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor doctor1;
		doctor1 = new Doctor("John Smith", "12345", 150000);

//		doc1.name = "John Smith";
//		doc1.licenceId = "12345";
//		doc1.salary = 150000;

		System.out.println("Doctor's name is " + doctor1.name);

		doctor1.displayInfo();
		doctor1.treatPatient("Adam Smith");

		// Break until 8:25
		// create a couple of more doctors and play with them.

	}

}
