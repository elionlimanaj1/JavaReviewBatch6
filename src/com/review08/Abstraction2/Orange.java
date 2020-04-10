package com.review08.Abstraction2;

public class Orange extends Fruit implements Peelable {

	public Orange(String color) {
		super(color);
	}

	public void eat() {
		peel();
		System.out.println("Eating the orange");
	}

	@Override
	public void peel() {
		System.out.println("Let's peel the orange");
	}
}
