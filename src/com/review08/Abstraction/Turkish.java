package com.review08.Abstraction;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}
	
	public void makeBaklava() {
		System.out.println("I am making baklava");
	}

	@Override
	public void talk() {
		System.out.println(name + " merhaba diyor!");
	}
}