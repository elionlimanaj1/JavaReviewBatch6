package com.review10;

import java.util.*;

public class SetIntro {

	public static void main(String[] args) {
//						Collection
//		List			  |				Set					 |	Queue
//	ArrayList LinkedList  |	HashSet	LinkedHashSet	TreeSet  |

		Set<String> africaLinked = new LinkedHashSet<>();
		africaLinked.add("Tunisia");
		africaLinked.add("Morocco");
		africaLinked.add("Kenya");

		// Will not add in the Set, because it already exists
		africaLinked.add("Kenya");

		africaLinked.add("Algeria");

		// You cannot add with an index!!!
//		africa.add(2, "Egypt");

		System.out.println("LinkedHashSet " + africaLinked);

		Set<String> africa2 = new HashSet<>(africaLinked);
		System.out.println("HashSet " + africa2);

		Set<String> africa3 = new TreeSet<>(africaLinked);
		System.out.println("TreeSet " + africa3);

		int size = africa2.size();
		boolean contains = africa2.contains("Kenya");
		boolean isEmpty = africa2.isEmpty();
		boolean ableToRemove = africa2.remove("Algeria");

		// You are not able to remove by index
//		africa2.get(2);

		// 1st way, DOES NOT work in a set
//		for (int i = 0; i < africa2.size(); i++) {
//			String country = africa2.get(i);
//			System.out.print(country + " ");
//		}

		// 2nd way, enhanced/advanced for loop
		System.out.println("---enhanced/advanced for loop---");
		for (String country : africa2) {
			System.out.print(country + " ");
		}
		System.out.println();

		// 3rd way, using iterator
		System.out.println("---using iterator---");
		Iterator<String> it = africa2.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
		}
		System.out.println();

		// 1. List preserves insertion order, BUT Set doesn't
		// 2. List contains duplicates, BUT Set contains unique objects

		Set<String> europe = new HashSet<>();
		europe.add("Albania");
		europe.add("France");
		europe.add(null);
		europe.add("Spain");
		europe.add("Portugal");
		europe.add("Spain");
		europe.add(null);

		System.out.println(europe);

		// Collection Framework
		// Collection Interface
		// Collections is a class
		String minimum = Collections.min(africa2);
		System.out.println(minimum);

		Set<Integer> numbers = new HashSet<>();
		numbers.add(56);
		numbers.add(23);
		numbers.add(49);
		numbers.add(93);
		numbers.add(17);

//		for (Integer obj : numbers) {
//			System.out.println(obj);
//		}

		Integer minInt = Collections.min(numbers);
		Integer maxInt = Collections.max(numbers);
		System.out.println("Numbers from " + minInt + " to " + maxInt);
	}

}
