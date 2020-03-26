package com.review01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstLine = input.nextLine();
		System.out.println("firstLine was: " + firstLine);
		
		String firstWord = input.next();
		System.out.println("firstWord was: " + firstWord);
		
		String secondWord = input.next();
		System.out.println("secondWord was: " + secondWord);

		String thirdWord = input.next();
		System.out.println("thirdWord was: " + thirdWord);	
	}

}
