package com.review08.Polymorphism;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println(name + " merhaba diyor!");
	}
	
	private void makeBaklava() {
		System.out.println("I am making baklava");
	}

}
