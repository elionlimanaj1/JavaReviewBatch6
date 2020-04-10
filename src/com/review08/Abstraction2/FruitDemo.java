package com.review08.Abstraction2;

public class FruitDemo {
	public static void main(String[] args) {
		//Peelable p1 = new Apple("Yellow");
		
		Fruit f1 = new Apple("Red");
		f1.eat();
//		f1.peel();

		Apple a1 = (Apple) f1;
		a1.peel();
		a1.wash();
		
		System.out.println();
		Orange o1 = new Orange("Orange");
		o1.eat();
		
	}

}
