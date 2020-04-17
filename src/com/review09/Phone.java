package com.review09;

public class Phone {
	// private variables
	private String serialNumber;
	private String brand;
	private String password;

	// public variable
	public double price;

	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
	}

	public void displayInfo() {
		System.out.println("This a " + this.brand + " phone with serial number " + serialNumber);
		System.out.println("It costs $" + price);
	}

	// Getters and Setters

	// I will give you the serial number
	// if you give me the correct password
	public String getSerialNumber(String password) {
		String result = "";

		if (this.password.equals(password)) {
			result = serialNumber;
		} else {
			result = "Invalid Access!!!";
		}

		return result;
	}

	// You will be able to change the serial number
	// only if you give me a 7-character string
	public void setSerialNumber(String serialNumber) {
		if (serialNumber.length() == 7) {
			this.serialNumber = serialNumber;
		}
	}

	// Brand is view only
	public String getBrand() {
		return brand;
	}

	// HW for Sarmed.
	// Change the setSerialNumber
	// He/she needs to provide the correct password
	// and to be a 7-character string
}