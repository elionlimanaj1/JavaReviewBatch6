package com.review01;

public class VariableDemo {

	public static void main(String[] args) {
		// Declare the variable
		String firstName;
		// Assign a value
		firstName = "John";

		// Declare the variable & Assign a value
		String lastName = "Smith";
		
		int age = 29;

		System.out.println(firstName + " " + lastName + " is " + age + " years old");

		// re-assign a new value to the variables
		lastName = "Brown";
		age = 32;
		
		System.out.println("After getting married :)");
		System.out.println(firstName + " " + lastName + " is " + age + " years old");
	}

}
