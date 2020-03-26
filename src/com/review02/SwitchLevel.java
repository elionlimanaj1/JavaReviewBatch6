package com.review02;

public class SwitchLevel {

	public static void main(String[] args) {

		// Write a program to find out the user level of experience 
		// Must use a switch statement with a String variable named levelString and a
		// int variable named level 
		// Beginner level should be 1
		// Intermediate level should be 2
		// Expert level should be 3

//		 Declaring String variable  
		String levelString = "Expert";
		int level = 0;
		// Using String in Switch expression  
		switch (levelString) {
		// Using String Literal in Switch case
		case "Beginner":
			level = 1;
			break;
		case "Intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
			break;
		}
		System.out.println("Your Level is: " + level);
	}
}