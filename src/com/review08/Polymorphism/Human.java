package com.review08.Polymorphism;

public class Human {
	String name;
	static String planet;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void talk() {
		System.out.println(name + " says hi there!");
	}

}
