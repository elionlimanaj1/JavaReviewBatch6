package com.review01;

public class TypeConversion {
	public static void main(String[] args) {
		// You don't need to memorize it :)

		int intNumber = 25;
		double doubleNumber = intNumber;
		System.out.println("The doubleNumber is " + doubleNumber);

		// 19 is between -128 and 127
		int numberInt = 19;
		byte numberByte = (byte) numberInt;
		System.out.println("The byte value is " + numberByte);

		// 260 is bigger than 256
		numberInt = 260;
		numberByte = (byte) numberInt;
		System.out.println("The byte value is " + numberByte);

		numberByte = 80;
		numberInt = numberByte;
		System.out.println("The int value is " + numberInt);

	}
}
