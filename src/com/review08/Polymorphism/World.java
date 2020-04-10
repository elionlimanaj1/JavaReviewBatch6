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

		// upcasting/widening/done implicitly
		Human b1 = new Belarusian("Vitali");
		b1.talk();
		// bela.pickMushrooms();

		// downcasting/narrowing/done explicitly
		Belarusian bela = (Belarusian) b1;
		bela.pickMushrooms();

		// cannot convert/cast Vilati into Turkish
		// will throw an exception
		// Turkish tur = (Turkish) b1;

		h1.talk();
		h2.talk();
		t1.talk();
		b1.talk();

		System.out.println("-----purpose of upcasting-----");
		// purpose of upcasting
		Human[] people = new Human[6];
		people[0] = h1;
		people[1] = h2;
		people[2] = t1;
		people[3] = b1;
		people[4] = new Turkish("Veli"); // upcasting
		people[5] = new Belarusian("Olga"); // upcasting

		for (Human person : people) {
			person.talk();

			if (person instanceof Belarusian) {
				// if the object is of type Belarusian
				Belarusian belarus = (Belarusian) person;
				belarus.pickMushrooms();
			} else if (person instanceof Turkish) {
				// if the object is of type Turkish
				Turkish turk = (Turkish) person;
				turk.makeBaklava();
			}
		}

	}
}