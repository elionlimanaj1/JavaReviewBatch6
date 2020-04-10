package com.review08.Abstraction;

public class World {

	public static void main(String[] args) {
		Human h1 = new Turkish("Turker"); // upcasting
		h1.talk();
		h1.sleep();

		Human h2 = new Belarusian("Vitali"); // upcasting
		h2.talk();
		h2.sleep();
		
//		h2.pickMushrooms();
		Belarusian belarus = (Belarusian) h2;
		belarus.pickMushrooms();
	}

}
