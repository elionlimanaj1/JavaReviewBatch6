package com.review08.Polymorphism;

public class World {

	public static void main(String[] args) {
		Human.planet = "World";

		Human h1 = new Human("Turker");
		System.out.println("The best student is " + h1.name);

		Human h2 = new Human("Gulbahar");

		System.out.println(h2.name + " lives in " + Human.planet);

		System.out.println(h1.name + " lives in " + Human.planet);

		Human t1 = new Turkish("Ali");
		System.out.println(t1.name + " lives in " + Human.planet);

		System.out.println("---Now people are talking---");

		// upcasting/widening/implicitly
		Human b1 = new Belarusian("Vitali");
		b1.talk();
		//bela.pickMushrooms();

		// downcasting/narrowing/explicitly
		Belarusian bela = (Belarusian) b1;
		bela.pickMushrooms();

		h1.talk();
		h2.talk();
		t1.talk();
		b1.talk();

	}
}

//Break until 8:41, for Yunus
