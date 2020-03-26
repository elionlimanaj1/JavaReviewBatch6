package com.review02;

import java.util.Scanner;

public class IfElseIfMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number for the month:");
		int month = scan.nextInt();

		System.out.println("The month you entered is " + month);

		String monthString;
		if (month == 1) {
			monthString = "January";
		} else if (month == 2) {
			monthString = "February";
		} else if (month == 3) {
			monthString = "March";
		} else if (month == 4) {
			monthString = "April";
		} else if (month == 5) {
			monthString = "May";
		} else if (month == 6) {
			monthString = "June";
		} else if (month == 7) {
			monthString = "July";
		} else if (month == 8) {
			monthString = "August";
		} else if (month == 9) {
			monthString = "September";
		} else if (month == 10) {
			monthString = "October";
		} else if (month == 11) {
			monthString = "November";
		} else if (month == 12) {
			monthString = "December";
		} else {
			monthString = "Invalid";
		}

		System.out.println("The month is " + monthString);

	}

}
