package com.review08.Polymorphism;

public class Belarusian extends Human{
	
	public Belarusian(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(name + " vitaju!");
	}
	
	public void pickMushrooms() {
		System.out.println(name + " is picking mushrooms!");
	}
}