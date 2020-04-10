package com.review08.Abstraction2;

public class Apple extends Fruit implements Peelable, Washable {

	public Apple(String color) {
		super(color);
	}

	public void eat() {
		System.out.println("Eating the apple");
	}

	@Override
	public void peel() {
		System.out.println("Let's peel the apple");
	}

	@Override
	public void wash() {
		System.out.println("Let's wash the apple");
	}
}
