package com.review09;

import java.util.*;

public class CollectionIntro {
	public static void main(String[] args) {
		List<String> africa = new LinkedList<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Algeria");
		africa.add(2, "Egypt");

		// 1st way
		List<String> africa2 = new ArrayList<String>(africa); // I created a filled list
		System.out.println(africa2);

		// 2nd way
		List<String> africa3 = new ArrayList<String>();// I created an empty list
		africa3.addAll(africa);
		System.out.println(africa3);

		System.out.println(africa);

		List<String> europe = new ArrayList<>(); // empty arraylist

		List<String> asia = null; // we don't have an object yet
		asia = new ArrayList<>(); // I created a list, but it is empty!!!

		boolean empty = asia.isEmpty();
		System.out.println("Asia is empty: " + empty);

		asia.add("China");
		asia.add("Tajikistan");
		asia.add("Japan");
		asia.add("Turkey");
		asia.add("China");
		asia.add("Nepal");
		asia.add("Japan");

		System.out.println(asia);

		System.out.println("Europe size is " + europe.size());
		System.out.println("Europe is empty: " + europe.isEmpty());

		europe.add("Albania");
		europe.add("France");
		europe.add("Spain");
		europe.add("Portugal");
		europe.add("Turkey");

		europe.add(2, "Germany");

		System.out.println("Europe size is " + europe.size());
		System.out.println(europe);

		europe.remove("Turkey");

		System.out.println("Europe size is " + europe.size());
		System.out.println("Europe is empty: " + europe.isEmpty());

//		System.out.println("After Corona");
//		europe.clear();

		System.out.println("---Iterate/Loop---");
		// 1st way
		for (int i = 0; i < europe.size(); i++) {
			String country = europe.get(i);
			System.out.print(country + " ");
		}
		System.out.println();

		// 2nd way
		for (String country : europe) {
			System.out.print(country + " ");
		}
		System.out.println();

		// 3rd way
		Iterator<String> it = europe.iterator();
//		it.next(); // will return the next element from the collection
//		it.hasNext(); // will return true/false
//		it.remove(); //will remove the element while iterating

		String country1 = it.next();
		String country2 = it.next();
		String country3 = it.next();
		String country4 = it.next();
		String country5 = it.next();
		if (it.hasNext()) {// this is a safe check
			String country6 = it.next();
		}
		System.out.println(country1 + " " + country2 + " " + country3);

		Iterator<String> it2 = europe.iterator();
		while (it2.hasNext()) { // As long as there is a next element. This will NOT move the cursor
			String country = it2.next(); // Get the next element. This will move the cursor
			System.out.print(country + " ");
		}
		System.out.println();

	}

	// HW for Sarmed and everyone
	// Add countries into Asia, add duplicates. I did it for you :)
	// Iterate the Asia list and remove duplicates
	// hint: you can create a new List
	// copy from asia into new list,
	// but first check if the list CONTAINS the country
}
