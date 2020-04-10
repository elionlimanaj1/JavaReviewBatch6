package com.review08.Polymorphism;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(name + " merhaba diyor!");
	}

	public void makeBaklava() {
		// this two are the same
		// this.talk();
		// talk();

		// super.talk();
		System.out.println("I am making baklava");
	}

}
